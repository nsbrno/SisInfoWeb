/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nsbruno.sisinfo.repository;

import java.io.Serializable;
import java.sql.ResultSet;
import java.util.List;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author Nogueira
 * @param <E> Entity
 * @param <ID> Integer or Long
 */
@NoRepositoryBean
public interface BaseMyRepository<E, ID extends Serializable> extends PagingAndSortingRepository<E, ID>{
    
    List<E> executeSQLClient(String select, String tableName);
    
    List<E> executeSQLAdmin(String selectQuery, String tableName);
    
    Integer executeSQLForCountClient(String selectQuery);
    
    Integer executeSQLForCountAdmin(String selectQuery);
    
    Integer executeInsertUpdateClient(String instrucaoSQL);
    
    Integer executeDeleteClient(String instrucaoSQL);
    
    Integer executeInsertUpdateAdmin(String instrucaoSQL);
    
    List<E> mapResultSetToObject(ResultSet rs, Class outputClass);
}
