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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import org.hibernate.exception.ConstraintViolationException;
import org.hibernate.exception.GenericJDBCException;
import org.hibernate.exception.JDBCConnectionException;
import org.hibernate.exception.LockAcquisitionException;
import org.hibernate.exception.SQLGrammarException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 *
 * @author Nogueira
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

    public Connection openConnectionDatabaseClient() {
        try {
            HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
            // Descriptografa caso o dispositivo, caso esteja criptografado
            byte[] senha = new CustomFunction().encryptDecrypt(CustomFunction.KEY_DECRYPT, request.getHeader(CustomFunction.KEY_DEVICE), GeneralConfiguration.CHAVE_DEFAULT_ENCRYPT_DECRYPT);
            String identityDevice = null;
            // Checa se foi necessario descriptografar
            if ((senha != null)) {
                // Salva os dados do dispositivo sem a criptografia
                identityDevice = new String(senha, "UTF-8");
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

    @Override
    @Transactional
    public ResultSet executeSQL(String instrucaoSQL) {
        try {
            openConnectionDatabaseClient();
            if ((connectionClient != null) && (!connectionClient.isClosed())) {
                //logger.debug(MensagemPadrao.LOGGER_EXECUTE_FIND + " | executarSQL | " + instrucaoSQL);

                return connectionClient.createStatement().executeQuery(instrucaoSQL);
            }
        } catch (SQLException ex) {
            throw new BaseMyException(ex);
        }
        return null;
    }

}
