/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nsbruno.sisinfo.service;

import br.com.nsbruno.sisinfo.beans.PageBeans;
import br.com.nsbruno.sisinfo.beans.PageableBeans;
import br.com.nsbruno.sisinfo.configuration.DefaultMessageConfiguration;
import br.com.nsbruno.sisinfo.function.CustomFunction;
import br.com.nsbruno.sisinfo.handler.exception.BaseMyException;
import br.com.nsbruno.sisinfo.repository.BaseMyRepository;
import com.google.gson.Gson;
import java.lang.reflect.Field;
import java.util.List;
import javax.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Bruno Nogueira Silva
 * @param <R> - Repository
 * @param <E> - Entity(model)
 */
public class BaseMyService<R extends BaseMyRepository, E> {

    public final static Integer PAGE_SIZE = 1000;

    @Autowired
    private final BaseMyRepository<E, Integer> baseMyRepository;

    public BaseMyService(R baseMyRepository) {
        this.baseMyRepository = baseMyRepository;
    }

    /**
     * Pega todos os registro de uma determinada tabela. Só que nestte método
     * existe uma paginação padrão que vai ser limitada mesmo que aja uma grande
     * quantidade de registro em uma tabela. Com este método pode limitar a
     * quantidade de registro por página para que assim que esta fazendo o
     * request possa trabalhar melhor com os dados e sem sobrecarregar a
     * aplicação que esta requisitando os dados.
     *
     * @param pageable
     * @return
     */
    public PageBeans<E> getAllAdmin(PageableBeans pageable) {
        try {
            int totalElements = 0;
            int totalPages;
            String tableName = this.getClass().getSimpleName().replace("Service", "");
            // Checa se foi passado alguma paginacao
            if ((pageable == null)) {
                pageable = new PageableBeans();
            }
            Integer resultCount = baseMyRepository.executeSQLForCountAdmin(new CustomFunction().constructSelectForCount(tableName, pageable));
            // Checa se retornou a quantidade de registro
            if ((resultCount != null) && (resultCount > 0)) {
                // Salva o total de registro/rows que o select obteve no banco de dados
                totalElements = resultCount;
            }
            // Verifica se foi passado algum limite de registros por pagina
            if (pageable.getPageSize() <= 0) {
                // Salva o tamanho de paginas padrao
                pageable.setPageSize(PAGE_SIZE);
            }
            // Pega o total de paginas possiveis
            totalPages = totalElements / pageable.getPageSize();
            // Verifica se eh paginas inteiras
            if ((totalElements % pageable.getPageSize()) != 0) {
                totalPages++;
            }
            // Verifica se foi passado o numero da pagina
            if (pageable.getPageNumber() < 0) {
                pageable.setPageNumber(0);
            }
            // Verifica se tem algum registro pra buscar
            if (totalElements > 0) {
                // Constroi um select com paginacao
                String sqlQuery = new CustomFunction().constructSelect(tableName, pageable);
                // Executa o select, buscando os dados
                //ResultSet resultado = baseMyRepository.executeSQLClient(sqlQuery);
                // Pega o resultado e salva em uma lista no formato na classe entity
                List<E> listResult = baseMyRepository.executeSQLAdmin(sqlQuery, tableName);

                return new PageBeans<>(pageable, totalElements, totalPages, listResult);
            } else {
                return new PageBeans<>(pageable, totalElements, totalPages, null);
            }
        } catch (Exception e) {
            throw new BaseMyException(e);
        }
    }

    /**
     * É a mesma função que o método {link #getAllAdmin}, mas irá fazer a busca
     * no banco de dados do cliente cadastrado no webservice.
     * 
     * @param pageable
     * @return
     */
    public PageBeans<E> getAllClient(PageableBeans pageable) {
        try {
            int totalElements = 0;
            int totalPages;
            String tableName = this.getClass().getSimpleName().replace("Service", "");
            // Checa se foi passado alguma paginacao
            if ((pageable == null)) {
                pageable = new PageableBeans();
            }
            Integer resultCount = baseMyRepository.executeSQLForCountClient(new CustomFunction().constructSelectForCount(tableName, pageable));
            // Checa se retornou a quantidade de registro
            if ((resultCount != null) && (resultCount > 0)) {
                // Salva o total de registro/rows que o select obteve no banco de dados
                totalElements = resultCount;
            }
            // Verifica se foi passado algum limite de registros por pagina
            if (pageable.getPageSize() <= 0) {
                // Salva o tamanho de paginas padrao
                pageable.setPageSize(PAGE_SIZE);
            }
            // Pega o total de paginas possiveis
            totalPages = totalElements / pageable.getPageSize();
            // Verifica se eh paginas inteiras
            if ((totalElements % pageable.getPageSize()) != 0) {
                totalPages++;
            }
            // Verifica se foi passado o numero da pagina
            if (pageable.getPageNumber() < 0) {
                pageable.setPageNumber(0);
            }
            // Verifica se tem algum registro pra buscar
            if (totalElements > 0) {
                // Constroi um select com paginacao
                String sqlQuery = new CustomFunction().constructSelect(tableName, pageable);
                // Executa o select, buscando os dados
                //ResultSet resultado = baseMyRepository.executeSQLClient(sqlQuery);
                // Pega o resultado e salva em uma lista no formato na classe entity
                List<E> listResult = baseMyRepository.executeSQLClient(sqlQuery, tableName);

                return new PageBeans<>(pageable, totalElements, totalPages, listResult);
            } else {
                return new PageBeans<>(pageable, totalElements, totalPages, null);
            }
        } catch (Exception e) {
            throw new BaseMyException(e);
        }
    }

    /**
     * É a mesma função que o método {link #getOneByIdAdmin} só que a diferença
     * esta em qual banco de dados vai buscar a informação, que neste caso é no
     * banco de dados do cliente do webservice.
     *
     * @param id
     * @return
     */
    public E getOneByIdClient(Integer id) {
        try {
            String tableName = this.getClass().getSimpleName().replace("Service", "");
            StringBuilder sqlQuery = new StringBuilder();
            sqlQuery
                    .append("SELECT * FROM ")
                    .append(tableName)
                    .append(" WHERE ID_")
                    .append(tableName)
                    .append(" = ")
                    .append(id);
            // Pega o resultado e salva em uma lista no formato na classe entity
            List<E> listResult = baseMyRepository.executeSQLClient(sqlQuery.toString(), tableName);
            if ( (listResult != null) && (listResult.size() > 0) ){
                return listResult.get(0);
            } else {
                return null;
            }
        } catch (Exception e) {
            throw new BaseMyException(e);
        }
    }
    
    /**
     * Pega todos os dados do registro que esta salvo na tabela de banco de
     * dados apenas com o id do registro.
     *
     * @param id
     * @return
     */
    public E getOneByIdAdmin(Integer id) {
        try {
            String tableName = this.getClass().getSimpleName().replace("Service", "");
            StringBuilder sqlQuery = new StringBuilder();
            sqlQuery
                    .append("SELECT * FROM ")
                    .append(tableName)
                    .append(" WHERE ID_")
                    .append(tableName)
                    .append(" = ")
                    .append(id);
            // Pega o resultado e salva em uma lista no formato na classe entity
            List<E> listResult = baseMyRepository.executeSQLAdmin(sqlQuery.toString(), tableName);
            if ( (listResult != null) && (listResult.size() > 0) ){
                return listResult.get(0);
            } else {
                return null;
            }
        } catch (Exception e) {
            throw new BaseMyException(e);
        }
    }

    /**
     * É a mesma função que o método {link #saveOrUpdateAdmin} só que a
     * diferença esta em qual banco de dados que vai ser feito o insert ou
     * update.
     *
     * @param entity
     * @return
     */
    public E saveOrUpdateClient(E entity) {
        try {
            Field[] fields = entity.getClass().getDeclaredFields();
            for (Field field : fields) {
                field.setAccessible(true);
                if ((field.isAnnotationPresent(Id.class))) {
                    Integer idEntity = (Integer) field.get(entity);
                    Integer id;
                    if (idEntity != null) {
                        id = baseMyRepository.executeInsertUpdateClient(new CustomFunction().constructUpdateFromEntity(entity));
                    } else {
                        id = baseMyRepository.executeInsertUpdateClient(new CustomFunction().constructInsertFromEntity(entity));
                    }
                    return getOneByIdClient(id);
                }
            }
        } catch (IllegalAccessException | IllegalArgumentException | SecurityException e) {
            throw new BaseMyException(e);
        }
        return null;
    }

    /**
     * Salva ou atualiza os dados passado por parâmetro no formato de Entity. O
     * método checa se existe algum id, se existir então fazer uma alteração, se
     * não fazer uma inserção no banco de ados. De qualquer forma é criado uma
     * instrução SQL somente com os dados que foram passado no parâmetro no
     * formato de Entity. Após inserir/alterar é retornado os dados completo da 
     * Entity, ou seja, é retorna todos os dados do registro que tem no banco de
     * dados apenas se baseando no id do registro.
     *
     * @param entity
     * @return
     */
    public E saveOrUpdateAdmin(E entity) {
        //String tableName = this.getClass().getSimpleName().replace("Service", "");
        try {
            Field[] fields = entity.getClass().getDeclaredFields();
            for (Field field : fields) {
                field.setAccessible(true);
                if ((field.isAnnotationPresent(Id.class))) {
                    Integer idEntity = (Integer) field.get(entity);
                    Integer id;
                    if (idEntity != null) {
                        id = baseMyRepository.executeInsertUpdateAdmin(new CustomFunction().constructUpdateFromEntity(entity));
                    } else {
                        id = baseMyRepository.executeInsertUpdateAdmin(new CustomFunction().constructInsertFromEntity(entity));
                    }
                    return getOneByIdAdmin(id);
                }
            }
        } catch (IllegalAccessException | IllegalArgumentException | SecurityException ex) {
            throw new BaseMyException(DefaultMessageConfiguration.NOT_SAVE + " \n - BaseMyService - Os dados são: \n" + new Gson().toJson(entity), ex);
        }
        throw new BaseMyException(DefaultMessageConfiguration.NOT_SAVE + " \n - BaseMyService - Os dados são: \n" + new Gson().toJson(entity));
    }

    /**
     * Vai deletar o registro no banco de dados do cliente.
     * Tem que ser passado o id do registro que é pra ser deletado.
     * 
     * @param id
     * @return
     */
    public Integer deleteClient(Integer id) {
        String tableName = this.getClass().getSimpleName().replace("Service", "");
        StringBuilder sqlQuery = new StringBuilder();
        sqlQuery.append("DELETE FROM ").append(tableName).append(" WHERE ID_").append(tableName).append(" = ").append(id);
        return baseMyRepository.executeDeleteClient(sqlQuery.toString().toUpperCase());
    }
    
    public void deleteAdmin(Integer id) {
        baseMyRepository.deleteById(id);
    }
}
