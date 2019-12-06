/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nsbruno.sisinfo.controller;

import br.com.nsbruno.sisinfo.configuration.DefaultMessageConfiguration;
import br.com.nsbruno.sisinfo.handler.exception.BaseMyException;
import br.com.nsbruno.sisinfo.model.ErrorMessageEntity;
import br.com.nsbruno.sisinfo.service.BaseMyService;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Id;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.HandlerMapping;

/**
 *
 * @author Nogueira
 * @param <S> Service
 * @param <E> Entity
 */
public class BaseMyController<S extends BaseMyService, E extends Serializable> {
    
    public static final String MAPPING_CLIENT_V1 = "/client/v1";
    public static final String MAPPING_ADMIN_V1 = "/admin/v1";
    public static final String PARAM_WHERE = "where";

    @Autowired
    protected S baseMyService;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Iterable<?>> getAll(  Pageable pageable, 
                                                @RequestParam(name = PARAM_WHERE, required = false) String where, 
                                                HttpServletRequest request) {
        String s1 = request.getRequestURI();
        //Cria uma variavel para retornar um erro
        ErrorMessageEntity errorMessageEntity = new ErrorMessageEntity();
        errorMessageEntity.setTimestamp(new Date());
        errorMessageEntity.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
        errorMessageEntity.setError(HttpStatus.INTERNAL_SERVER_ERROR.name());
        errorMessageEntity.setPath((String) request.getAttribute(HandlerMapping.PATH_WITHIN_HANDLER_MAPPING_ATTRIBUTE));
        // Checo qual eh a rota que esta fazendo a solicitacao
        if ((request.getRequestURI() != null) && (request.getRequestURI().toLowerCase().contains(MAPPING_CLIENT_V1))){
            return new ResponseEntity<>(baseMyService.getAllClient(pageable, s1), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(baseMyService.getAll(pageable), HttpStatus.OK);
        }
    }

    @RequestMapping(path = {"/{id}"}, method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getOneById(@PathVariable("id") Integer id) {
        Optional object = (Optional) baseMyService.getOneById(id);
        // Verifica se retornou algum coisa do banco de dados
        if (object == null || !object.isPresent()) {
            // Retorna um status de nao encontrado
            //return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            throw new BaseMyException(DefaultMessageConfiguration.NOT_FOUND_BY_ID + " \n ID: " + id);
        }
        return new ResponseEntity<>(object, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> save(@RequestBody E entity) {
        E objectSave = (E) baseMyService.saveOrUpdate(entity);
        try {
            Field[] fields = objectSave.getClass().getDeclaredFields();
            for (Field field : fields) {
                field.setAccessible(true);
                if ((field.isAnnotationPresent(Id.class))) {
                    Object id = field.get(entity);
                    Optional object = (Optional) baseMyService.getOneById((Integer) field.get(entity));
                    return new ResponseEntity<>(object, HttpStatus.OK);
                }
            }
        } catch (IllegalArgumentException | IllegalAccessException ex) {
            Logger.getLogger(BaseMyController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>(objectSave, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(baseMyService.saveOrUpdate(entity), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> update(@RequestBody E entity) {
        return new ResponseEntity<>(baseMyService.saveOrUpdate(entity), HttpStatus.OK);
    }

    @RequestMapping(path = {"/{id}"}, method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> deleteById(@PathVariable("id") Integer id) {
        baseMyService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
