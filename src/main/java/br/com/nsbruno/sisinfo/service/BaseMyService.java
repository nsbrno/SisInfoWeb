/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nsbruno.sisinfo.service;

import br.com.nsbruno.sisinfo.configuration.DefaultMessageConfiguration;
import br.com.nsbruno.sisinfo.function.CustomFunction;
import br.com.nsbruno.sisinfo.handler.exception.BaseMyException;
import br.com.nsbruno.sisinfo.repository.BaseMyRepository;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

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

    @Autowired
    private HttpServletRequest request;

    public BaseMyService(R baseMyRepository) {
        this.baseMyRepository = baseMyRepository;
    }

    public Iterable<E> getAll(Pageable pageable) {

        return baseMyRepository.findAll(pageable);
    }

    public List<E> getAllClient(Pageable pageable, String where){
        try {
            // Checa se foi passado alguma paginacao
            if (pageable == null) {
                pageable = PageRequest.of(0, PAGE_SIZE);
            }
            String sqlQuery = new CustomFunction().constructSelect(this.getClass().getSimpleName().toUpperCase().replace("SERVICE", ""), where, pageable);
            
            ResultSet resultado = baseMyRepository.executeSQL(sqlQuery);

            return mapResultSetToObject(resultado, Class.forName("br.com.sisinfoweb.entity." + this.getClass().getSimpleName().replace("Service", "") + "Entity"));

        } catch (ClassNotFoundException e) {
            throw new BaseMyException(e);
        } catch (Exception e) {
            throw new BaseMyException(e);
        }
    }

    public E getOneById(Integer id) {
        return (E) baseMyRepository.findById(id);
    }

    public E saveOrUpdate(E entity) {
        return (E) baseMyRepository.save(entity);
    }

    public void delete(Integer id) {
        baseMyRepository.deleteById(id);
    }
    
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
                                        if ( (columnValue instanceof byte[]) && 
                                                (columnName.equalsIgnoreCase("obs") || 
                                                 columnName.equalsIgnoreCase("observacao") || 
                                                 columnName.equalsIgnoreCase("descricao_auxiliar") ||
                                                 columnName.equalsIgnoreCase("descricao") ||
                                                 columnName.equalsIgnoreCase("complemento") ) ){
                                            BeanUtils.setProperty(bean, field.getName(), new String((byte[])columnValue));
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
                            outputList = new ArrayList<E>();
                        }
                        outputList.add(bean);
                    }
                    // Checa se a lista eh nula pra retornar uma lista vazia
                    if (outputList == null) {
                        outputList = new ArrayList<E>();
                    }
                } else {
                    throw new BaseMyException(DefaultMessageConfiguration.OUTPUTCLASS_NOT_ENTITY);
                }
            } else {
                return null;
            }
        } catch (IllegalAccessException | SQLException | 
                InstantiationException | BaseMyException | 
                IllegalArgumentException | NoSuchMethodException | 
                SecurityException | InvocationTargetException  e) {
            throw new BaseMyException(DefaultMessageConfiguration.INTERNAL_ERROR_FROM_MAP_RESULT, e.getCause());
        }
        return outputList;
    }
}
