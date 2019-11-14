/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nsbruno.sisinfo.repository;

import java.io.Serializable;
import javax.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

/**
 *
 * @author Nogueira
 * @param <E>
 * @param <ID>
 */
public class BaseMyRepositoryImpl<E, ID extends Serializable> extends SimpleJpaRepository<E, ID> implements BaseMyRepository<E, ID>{

    @Autowired
    private final EntityManager entityManager;
    
    public BaseMyRepositoryImpl(Class<E> domainClass, EntityManager em) {
        super(domainClass, em);
        this.entityManager = em;
    }

}
