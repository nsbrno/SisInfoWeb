/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nsbruno.sisinfo.repository;

import br.com.nsbruno.sisinfo.configuration.DefaultMessageConfiguration;
import br.com.nsbruno.sisinfo.configuration.GeneralConfiguration;
import br.com.nsbruno.sisinfo.function.CustomFunction;
import br.com.nsbruno.sisinfo.handler.exception.BaseMyException;
import br.com.nsbruno.sisinfo.model.CfaclifoEntity;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * Classe responsável em fazer a comunicação com o banco de dados, seja com o
 * banco do cliente ou com o banco de administração(banco do webservice).
 *
 * @author Bruno Nogueira Silva
 * @param <E>
 * @param <ID>
 */
public class BaseMyRepositoryImpl<E, ID extends Serializable> extends SimpleJpaRepository<E, ID> implements BaseMyRepository<E, ID> {

    public static final String DRIVE_FIREBIRD = "org.firebirdsql.jdbc.FBDriver";
    public static final String PROTOCOL_FIREBIRD = "jdbc:firebirdsql";
    public static final String PARAM_CONNECTION_FIREBIRD = "rewriteBatchedStatements=true&charSet=UTF8&collate=UNICODE_CI_AI";
    private Connection connectionClient;

    @Autowired
    private final EntityManager entityManager;

    public BaseMyRepositoryImpl(JpaEntityInformation entityInformation, EntityManager em) {
        super(entityInformation, em);
        this.entityManager = em;
    }

    /**
     * Cria uma conexão com o banco de dados do cliente. Pega os dados de
     * conexão na tablea CFACLIFO onde contem a porta, ip, e caminho do banco de
     * dados do cliente. Com esses dados é feito uma conexão e essa mesma
     * conexão é retornada para quem solicitar este métodos.
     *
     * @return - Connextion
     */
    public Connection openConnectionDatabaseClient() {
        try {
            HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
            // Descriptografa caso o dispositivo, caso esteja criptografado
            byte[] senha = new CustomFunction().encryptDecrypt(CustomFunction.KEY_DECRYPT, request.getHeader(CustomFunction.KEY_DEVICE), GeneralConfiguration.CHAVE_DEFAULT_ENCRYPT_DECRYPT);
            String identityDevice;
            // Checa se foi necessario descriptografar
            if ((senha != null)) {
                // Salva os dados do dispositivo sem a criptografia
                identityDevice = new String(senha, "UTF-8");
            } else {
                identityDevice = request.getHeader(CustomFunction.KEY_DEVICE);
            }
            StringBuilder sqlSelect = new StringBuilder();
            sqlSelect.append("SELECT * FROM CFACLIFO ");
            sqlSelect.append("WHERE CFACLIFO.ID_CFACLIFO = ");
            sqlSelect.append("(SELECT SMADISPO.ID_CFACLIFO FROM SMADISPO WHERE SMADISPO.IDENTIFICACAO = '");
            sqlSelect.append(identityDevice).append("');");

            // Pega os dados de conexao da empresa licenciada
            Query query = entityManager.createNativeQuery(sqlSelect.toString(), CfaclifoEntity.class);
            CfaclifoEntity cfaclifoEntity = (CfaclifoEntity) query.getSingleResult();

            // Checa se retornou alguma coisa do banco
            if ((cfaclifoEntity != null) && (cfaclifoEntity.getIdCfaclifo() != null)) {
                // Usa um metodo para pegar os dados de usuario e senha
                Map<String, String> auth = new CustomFunction().getUserAndPassowordFromAuth(request);

                Class.forName(DRIVE_FIREBIRD);
                connectionClient = DriverManager.getConnection(
                        PROTOCOL_FIREBIRD + ":" + cfaclifoEntity.getIpServidorSisinfo() + "/" + cfaclifoEntity.getPortaBancoSisinfo() + ":" + cfaclifoEntity.getCaminhoBancoSisinfo() + "?" + PARAM_CONNECTION_FIREBIRD,
                        auth.get(CustomFunction.KEY_USERNAME),
                        auth.get(CustomFunction.KEY_PASSWORD));

            } else {
                throw new BaseMyException(DefaultMessageConfiguration.NOT_FOUND_CLIENT_DATABASE);
            }
            // Se a conexao foi com sucesso entao vai ser retornado a conexao
            return connectionClient;
        } catch (ClassNotFoundException | SQLException | UnsupportedEncodingException erroSQL) {
            connectionClient = null;
            //logger.error(MensagemPadrao.ERROR_CONECT_DATABASE + " | " + erroSQL.getMessage());
            throw new BaseMyException(erroSQL);
        }
        //logger.error(MensagemPadrao.ERROR_CONECT_DATABASE + " | " + erroSQL.getMessage());
    }

    /**
     * Checa se a conexão com o banco de dados do cliente esta em aberto, caso
     * seja sim, a variavel connectionClient esta aberta, então a conexão com o
     * banco de dados do cliente é fechada.
     */
    public void closeConnectionDatabaseClient() {
        try {
            // Checa se existe uma instancia e uma conexao aberto
            if ((connectionClient != null) && (!connectionClient.isClosed())) {
                connectionClient.close();
            }
        } catch (SQLException e) {
            throw new BaseMyException(e);
        }
    }

    /**
     * Metodos para pesquisar qualquer select passado por parametro.É
     * obrigatório passar a instrução em sql puro e só pode ser um sql diferente
     * de select. A pesquisa será feita no banco de dados do cliente. Ou seja, o
     * metodos vai se conectar no banco do cliente de acordo com os dados
     * cadastrado na tabela CFACLIFO, onde nesta tabela é pego o IP, a PORTA e o
     * CAMINHO do banco de dados do cliente para realizar a conexão.
     *
     * @param selectQuery - Instrução do SELECT na linguagem SQL pura.
     * @param tableName - Nome da tabela do banco de dados que eh pra ser
     * recuperada.
     * @return - Vai ser retornar um List, já de acordo com o formato da Entity
     * do banco de dados.
     */
    @Override
    @Transactional
    public List<E> executeSQLClient(String selectQuery, String tableName) {
        try {
            if ((selectQuery != null) && (!selectQuery.isEmpty())) {
                openConnectionDatabaseClient();
                if ((connectionClient != null) && (!connectionClient.isClosed())) {
                    //logger.debug(MensagemPadrao.LOGGER_EXECUTE_FIND + " | executarSQL | " + instrucaoSQL);
                    List<E> listResult = mapResultSetToObject(
                            connectionClient.createStatement().executeQuery(selectQuery),
                            Class.forName("br.com.nsbruno.sisinfo.model." + tableName + "Entity")
                    );
                    return listResult;
                }
            } else {
                throw new BaseMyException(DefaultMessageConfiguration.QUERY_NOT_FOUND);
            }
        } catch (SQLException | ClassNotFoundException | SecurityException ex) {
            throw new BaseMyException(ex);
        } finally {
            closeConnectionDatabaseClient();
        }
        return null;
    }

    /**
     * Método para executar apenas SELECT's.
     * Lembrando que toda terminação Admin significa que vai buscar no banco de
     * dados de administração, ou seja, no banco de dados configurado para o 
     * Webservice.
     * 
     * @param selectQuery
     * @param tableName
     * @return - List<E>
     */
    @Override
    @Transactional
    public List<E> executeSQLAdmin(String selectQuery, String tableName) {
        try {
            if ((selectQuery != null) && (!selectQuery.isEmpty())) {
                // Checa se o entity manager esta instanciado
                if ((entityManager != null) && (entityManager.isOpen())) {
                    //logger.debug(MensagemPadrao.LOGGER_EXECUTE_FIND + " | executarSQL | " + instrucaoSQL);

                    Query query = entityManager.createNativeQuery(
                            selectQuery,
                            Class.forName("br.com.nsbruno.sisinfo.model." + tableName + "Entity"));
                    List<E> listResult = query.getResultList();
                    return listResult;
                }
            } else {
                throw new BaseMyException(DefaultMessageConfiguration.QUERY_NOT_FOUND);
            }
        } catch (SecurityException | ClassNotFoundException ex) {
            throw new BaseMyException(ex);
        }
        return null;
    }

    /**
     * Metodos usado para contar um determinada select. De preferencia já passar
     * o select apena com o count, por exemplo: SELECT COUNT(*) FROM TABLE WHERE
     * TABLE.A = A;
     *
     * @param selectQuery
     * @return
     */
    @Override
    @Transactional
    public Integer executeSQLForCountClient(String selectQuery) {
        try {
            if ((selectQuery != null) && (!selectQuery.isEmpty())) {
                openConnectionDatabaseClient();
                if ((connectionClient != null) && (!connectionClient.isClosed())) {
                    //logger.debug(MensagemPadrao.LOGGER_EXECUTE_FIND + " | executarSQL | " + instrucaoSQL);
                    ResultSet resultCount;
                    // Checa se eh um select com count(*)
                    if (selectQuery.toUpperCase().contains("COUNT(*)")) {
                        resultCount = connectionClient.createStatement().executeQuery(selectQuery);
                        // Checa se retornou a quantidade de registro
                        if ((resultCount != null) && (resultCount.next())) {
                            // Salva o total de registro/rows que o select obteve no banco de dados
                            return resultCount.getInt(1);
                        }
                    } else {
                        int count = 0;
                        resultCount = connectionClient.createStatement().executeQuery(selectQuery);
                        // Checa se retornou a quantidade de registro
                        if ((resultCount != null)) {
                            while (resultCount.next()) {
                                ++count;
                            }
                        }
                        return count;
                    }
                }
            } else {
                throw new BaseMyException(DefaultMessageConfiguration.QUERY_NOT_FOUND);
            }
        } catch (SQLException ex) {
            throw new BaseMyException(ex);
        } finally {
            closeConnectionDatabaseClient();
        }
        return null;
    }

    /**
     * Método usado para constar a quantidade de registros que vai ser
     * recuperado no banco de dados de administração. Lembrando que tem que ser
     * passado um SELECT, onde pode ser com COUNT(*) ou a instrução SELECT
     * qualquer, pois o método irá verificar se no parâmetro passado (SELECT)
     * contem as palavras COUNT(*) onde será recuperado a contagem em um único
     * retorno do banco de dados, mas caso seja passar um SELECT qualquer o
     * método vai fazer uma contagem utilizando um loop.
     *
     * @param selectQuery
     * @return
     */
    @Override
    @Transactional
    public Integer executeSQLForCountAdmin(String selectQuery) {
        try {
            if ((selectQuery != null) && (!selectQuery.isEmpty())) {
                if ((entityManager != null) && (entityManager.isOpen())) {
                    //logger.debug(MensagemPadrao.LOGGER_EXECUTE_FIND + " | executarSQL | " + instrucaoSQL);
                    // Checa se eh um select com count(*)
                    if (selectQuery.toUpperCase().contains("COUNT(*)")) {
                        // O entity manager vai retornar um BigInteger, entao convertemos para Integer
                        return ((BigInteger) entityManager.createNativeQuery(selectQuery).getSingleResult()).intValue();
                    } else {
                        List<E> listResult = entityManager.createNativeQuery(selectQuery).getResultList();
                        // Checa se retornou a quantidade de registro
                        if ((listResult != null) && (listResult.size() > 0)) {
                            return listResult.size();
                        } else {
                            return 0;
                        }
                    }
                }
            } else {
                throw new BaseMyException(DefaultMessageConfiguration.QUERY_NOT_FOUND);
            }
        } catch (Exception ex) {
            throw new BaseMyException(ex);
        }
        return null;
    }
    
    /**
     * Método para executar apenas INSERT ou UPDATE.
     * Já tem que ser passado um SQL puro, nativo para ser executado.
     * 
     * @param instrucaoSQL
     * @return - Vai retornar de acordo que o tipo de instrução SQl, por
     * exemplo: No caso de um insert ou update com a clausula RETURNING, vai
     * retornar o id do insert, diferente disso vai retornar apenas a quantidade
     * de registros afetados.
     */
    @Override
    @Transactional
    public Integer executeInsertUpdateClient(String instrucaoSQL) {
        PreparedStatement preparedStatement = null;
        Integer idReturning = -1;
        try {
            // Abre a conexao com o banco de dados do cliente
            openConnectionDatabaseClient();
            if ((connectionClient != null) && (!connectionClient.isClosed())) {
                //Statement statement = connection.createStatement();
                preparedStatement = connectionClient.prepareStatement(instrucaoSQL);

                if ((preparedStatement != null) && (!preparedStatement.isClosed())) {
                    preparedStatement.getConnection().setAutoCommit(false);

                    //logger.debug(MensagemPadrao.LOGGER_EXECUTE_FIND + " | executeInsertUpdateDelete | " + instrucaoSQL);

                    ResultSet rs = preparedStatement.executeQuery();

                    if ((rs != null) && (rs.next())) {
                        idReturning = rs.getInt(1);
                        preparedStatement.getConnection().commit();
                        //logger.info(MensagemPadrao.INSERT_SUCCESS);
                    } else {
                        preparedStatement.getConnection().rollback();
                    }
                }
            }
        } catch (SQLException ex) {
            if (preparedStatement != null){
                try {
                    preparedStatement.getConnection().rollback();
                } catch (SQLException exPrep) {
                    throw new BaseMyException(exPrep);
                }
            }
            throw new BaseMyException(ex);
        } finally {
            closeConnectionDatabaseClient();
            try {
                if ((preparedStatement != null) && (!preparedStatement.isClosed())){
                    preparedStatement.close();
                }
            } catch (SQLException ex) {
                throw new BaseMyException(ex);
            }
        }
        return idReturning;
    }
    
    /**
     * Método para executar uma instrução SQL de INSERT ou UPDATE.
     * 
     * @param instrucaoSQL
     * @return - Vai retornar o id no que esta sendo salvo ou alterado.
     */
    @Override
    @Transactional
    public Integer executeInsertUpdateAdmin(String instrucaoSQL) {
        try {
            if ((instrucaoSQL != null) && (!instrucaoSQL.isEmpty())) {
                if ((entityManager != null) && (entityManager.isOpen())) {
                    // O entity manager vai retornar um BigInteger, entao convertemos para Integer
                    Object objectReturned = entityManager.createNativeQuery(instrucaoSQL).getSingleResult();
                    // Checa se eh um BigInteger
                    if ( (objectReturned != null) && (objectReturned instanceof BigInteger) ){
                        return ((BigInteger) objectReturned).intValue();
                    } else {
                        return (Integer) objectReturned;
                    }
                }
            } else {
                throw new BaseMyException(DefaultMessageConfiguration.QUERY_NOT_FOUND);
            }
        } catch (BaseMyException ex) {
            throw new BaseMyException(DefaultMessageConfiguration.NOT_SAVE + " \n - BaseMyRepositoryImpl - Os dados são: \n" + instrucaoSQL, ex);
        }
        throw new BaseMyException(DefaultMessageConfiguration.NOT_SAVE + " \n - BaseMyRepositoryImpl - Os dados são: \n" + instrucaoSQL);
    }
    
    /**
     * Método exclusivo para executar uma instrução SQL DELETE.
     *
     * @param instrucaoSQL
     * @return - É retornado o número de registros deletados, ou seja, a
     * quantidade de registros afetados com o DELETE.
     */
    @Override
    @Transactional
    public Integer executeDeleteClient(String instrucaoSQL) {
        PreparedStatement preparedStatement = null;
        Integer qtd = -1;
        try {
            // Abre a conexao com o banco de dados do cliente
            openConnectionDatabaseClient();
            if ((connectionClient != null) && (!connectionClient.isClosed())) {
                //Statement statement = connection.createStatement();
                preparedStatement = connectionClient.prepareStatement(instrucaoSQL);

                if ((preparedStatement != null) && (!preparedStatement.isClosed())) {
                    preparedStatement.getConnection().setAutoCommit(false);

                    //logger.debug(MensagemPadrao.LOGGER_EXECUTE_FIND + " | executeInsertUpdateDelete | " + instrucaoSQL);

                    qtd = preparedStatement.executeUpdate();

                    if (qtd > 0) {
                        preparedStatement.getConnection().commit();
                        //logger.info(MensagemPadrao.INSERT_SUCCESS);
                    } else {
                        preparedStatement.getConnection().rollback();
                        throw new BaseMyException(DefaultMessageConfiguration.NOT_DELETE + " \n - BaseMyRepositoryImpl - Os dados são: \n" + instrucaoSQL);
                    }
                }
            }
        } catch (SQLException ex) {
            if (preparedStatement != null){
                try {
                    preparedStatement.getConnection().rollback();
                } catch (SQLException exPrep) {
                    throw new BaseMyException(exPrep);
                }
            }
            throw new BaseMyException(DefaultMessageConfiguration.NOT_DELETE + " \n - BaseMyRepositoryImpl - Os dados são: \n" + instrucaoSQL, ex);
        } finally {
            closeConnectionDatabaseClient();
            try {
                if ((preparedStatement != null) && (!preparedStatement.isClosed())){
                    preparedStatement.close();
                }
            } catch (SQLException ex) {
                throw new BaseMyException(ex);
            }
        }
        return qtd;
    }
    
    /**
     * É um metodo para mapear o ResultSet com a classe Entity. Basicamente pega
     * o resultado do banco de dados do ResultSet e coloca dentro da classe
     * Entity para retornar os dados de acordo com o que foi mapeado dentro da
     * classe Entity.
     *
     * @param rs
     * @param outputClass
     * @return
     */
    @Override
    public List<E> mapResultSetToObject(ResultSet rs, Class outputClass) {
        List<E> outputList = null;
        try {
            // make sure resultset is not null
            if (rs != null) {
                // check if outputClass has 'Entity' annotation
                if (outputClass.isAnnotationPresent(Entity.class)) {
                    // get the resultset metadata
                    ResultSetMetaData rsmd = rs.getMetaData();
                    // get all the attributes of outputClass
                    Field[] fields = outputClass.getDeclaredFields();
                    while (rs.next()) {
                        E bean = (E) outputClass.getDeclaredConstructor().newInstance();
                        for (int _iterator = 0; _iterator < rsmd.getColumnCount(); _iterator++) {
                            // getting the SQL column name
                            String columnName = rsmd.getColumnLabel(_iterator + 1);
                            // reading the value of the SQL column
                            Object columnValue = rs.getObject(_iterator + 1);
                            // iterating over outputClass attributes to check if any attribute has 'Column' annotation with matching 'name' value
                            for (Field field : fields) {
                                if (field.isAnnotationPresent(Column.class)) {
                                    Column column = field.getAnnotation(Column.class);
                                    if (column.name().equalsIgnoreCase(columnName) && columnValue != null) {
                                        // Verifica se a coluna eh do tibo byte[](blob) e se eh um campo de texto
                                        if ((columnValue instanceof byte[])
                                                && (columnName.equalsIgnoreCase("obs")
                                                || columnName.equalsIgnoreCase("observacao")
                                                || columnName.equalsIgnoreCase("descricao_auxiliar")
                                                || columnName.equalsIgnoreCase("descricao")
                                                || columnName.equalsIgnoreCase("complemento"))) {
                                            BeanUtils.setProperty(bean, field.getName(), new String((byte[]) columnValue));
                                        } else {
                                            BeanUtils.setProperty(bean, field.getName(), columnValue);
                                        }
                                        //BeanUtils.setProperty(bean, field.getName(), columnValue);
                                        break;
                                    }
                                }
                            }
                        }
                        if (outputList == null) {
                            outputList = new ArrayList<>();
                        }
                        outputList.add(bean);
                    }
                    // Checa se a lista eh nula pra retornar uma lista vazia
                    if (outputList == null) {
                        outputList = new ArrayList<>();
                    }
                } else {
                    throw new BaseMyException(DefaultMessageConfiguration.OUTPUTCLASS_NOT_ENTITY);
                }
            } else {
                return null;
            }
        } catch (IllegalAccessException | SQLException
                | InstantiationException | BaseMyException
                | IllegalArgumentException | NoSuchMethodException
                | SecurityException | InvocationTargetException e) {
            throw new BaseMyException(DefaultMessageConfiguration.INTERNAL_ERROR_FROM_MAP_RESULT, e.getCause());
        }
        return outputList;
    }
}
