/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nsbruno.sisinfo.service;

import br.com.nsbruno.sisinfo.repository.BaseMyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;

/**
 *
 * @author Bruno Nogueira Silva
 * @param <R> - Repository
 * @param <E> - Entity(model)
 */
public class BaseMyService<R extends BaseMyRepository, E> {

    @Autowired
    private final BaseMyRepository<E, Integer> baseMyRepository;

    public BaseMyService(R baseMyRepository) {
        this.baseMyRepository = baseMyRepository;
    }

    public Iterable<E> getAll(Pageable pageable) {

        return baseMyRepository.findAll(pageable);
    }
    
    public E getOneById(Integer id){
        return (E) baseMyRepository.findById(id);
    }

    public E saveOrUpdate(E entity) {
        return (E) baseMyRepository.save(entity);
    }
    
    public void delete(Integer id){
        baseMyRepository.deleteById(id);
    }
}
