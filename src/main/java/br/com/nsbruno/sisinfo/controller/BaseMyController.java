/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nsbruno.sisinfo.controller;

import br.com.nsbruno.sisinfo.beans.PageBeans;
import br.com.nsbruno.sisinfo.beans.PageableBeans;
import br.com.nsbruno.sisinfo.configuration.DefaultMessageConfiguration;
import br.com.nsbruno.sisinfo.handler.exception.BaseMyException;
import br.com.nsbruno.sisinfo.model.ErrorMessageEntity;
import br.com.nsbruno.sisinfo.service.BaseMyService;
import java.io.Serializable;
import java.time.ZonedDateTime;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

    /**
     * Basicamente este método é uitlizado para fazer um SELECT no banco de
     * dados.
     *
     * Metodo para pegar todos os dados de uma determinada tabela. pode ser
     * passado um where dentro do parametro pageable. Este metodos é usado em
     * todas as classe que herdam esta classe basica (BaseMyController), então
     * não tem a necessidade de escrever um metodo para executar os padrão do
     * GET em um webservice REST.
     *
     * @param pageable
     * @param request - Padrão para pegar alguns dados da requisição. O próprio
     * Java se encarrega de preencher com os dados necessários.
     *
     * @return ResponseEntity<PageBeans>
     */
    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PageBeans> getAll(PageableBeans pageable,
            HttpServletRequest request) {
        //Cria uma variavel para retornar um erro
        ErrorMessageEntity errorMessageEntity = new ErrorMessageEntity();
        errorMessageEntity.setTimestamp(ZonedDateTime.now().toString());
        errorMessageEntity.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
        errorMessageEntity.setError(HttpStatus.INTERNAL_SERVER_ERROR.name());
        errorMessageEntity.setPath((String) request.getAttribute(HandlerMapping.PATH_WITHIN_HANDLER_MAPPING_ATTRIBUTE));
        // Checo qual eh a rota que esta fazendo a solicitacao
        if ((request.getRequestURI() != null) && (request.getRequestURI().toLowerCase().contains(MAPPING_CLIENT_V1))) {
            // Retorna o status OK junto com os dados coletado no banco de dados
            return new ResponseEntity<>(baseMyService.getAllClient(pageable), HttpStatus.OK);
        // Checa se eh um rota para acessar o banco de dados de administracao do webservice
        } else if ((request.getRequestURI() != null) && (request.getRequestURI().toLowerCase().contains(MAPPING_ADMIN_V1))) {
            //return new ResponseEntity<>(baseMyService.getAll(pageable), HttpStatus.OK);
            return new ResponseEntity<>(baseMyService.getAllAdmin(pageable), HttpStatus.OK);
        } else {
            //return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            throw new BaseMyException(DefaultMessageConfiguration.BAD_REQUEST + " - URL:" + request.getRequestURI());
        }
    }

    @RequestMapping(path = {"/{id}"}, method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getOneById(@PathVariable("id") Integer id,
            HttpServletRequest request) {
        if (id != null) {
            E objectReturn = null;
            // Checo qual eh a rota que esta fazendo a solicitacao
            if ((request.getRequestURI() != null) && (request.getRequestURI().toLowerCase().contains(MAPPING_CLIENT_V1))) {
                // Pega os dados no banco de dados
                objectReturn = (E) baseMyService.getOneByIdClient(id);
            // Checa se eh um rota para acessar o banco de dados de administracao do webservice
            } else if ((request.getRequestURI() != null) && (request.getRequestURI().toLowerCase().contains(MAPPING_ADMIN_V1))) {
                // Pega os dados no banco de dados
                objectReturn = (E) baseMyService.getOneByIdAdmin(id);
            } else {
                //return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
                throw new BaseMyException(DefaultMessageConfiguration.BAD_REQUEST + " - URL:" + request.getRequestURI());
            }
            if (objectReturn == null) {
                throw new BaseMyException(DefaultMessageConfiguration.NOT_FOUND_BY_ID + " \n ID: " + id);
            }
            // Retorna o status OK junto com os dados coletado no banco de dados
            return new ResponseEntity<>(baseMyService.getOneByIdClient(id), HttpStatus.OK);
        } else {
            throw new BaseMyException(DefaultMessageConfiguration.NOT_PARAM_ID + " \n ID: " + id);
        }
    }

    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> save(@RequestBody E entity, HttpServletRequest request) {
        try {
            // Checo qual eh a rota que esta fazendo a solicitacao
            if ((request.getRequestURI() != null) && (request.getRequestURI().toLowerCase().contains(MAPPING_CLIENT_V1))) {
                // Retorna o status OK junto com os dados coletado no banco de dados
                return new ResponseEntity<>(baseMyService.saveOrUpdateClient(entity), HttpStatus.OK);

                // Checa se eh um rota para acessar o banco de dados de administracao do webservice
            } else if ((request.getRequestURI() != null) && (request.getRequestURI().toLowerCase().contains(MAPPING_ADMIN_V1))) {
                // Salva os dados no banco e retorna ja com o ID da insercao
                return new ResponseEntity<>(baseMyService.saveOrUpdateAdmin(entity), HttpStatus.OK);
            } else {
                //return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
                throw new BaseMyException(DefaultMessageConfiguration.BAD_REQUEST + " - URL:" + request.getRequestURI());
            }
        } catch (IllegalArgumentException ex) {
            throw new BaseMyException(ex);
        }
    }

    @RequestMapping(method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> update(@RequestBody E entity, HttpServletRequest request) {
        // Checo qual eh a rota que esta fazendo a solicitacao
        if ((request.getRequestURI() != null) && (request.getRequestURI().toLowerCase().contains(MAPPING_CLIENT_V1))) {
            // Retorna o status OK junto com os dados coletado no banco de dados
            return new ResponseEntity<>(baseMyService.saveOrUpdateClient(entity), HttpStatus.OK);

            // Checa se eh um rota para acessar o banco de dados de administracao do webservice
        } else if ((request.getRequestURI() != null) && (request.getRequestURI().toLowerCase().contains(MAPPING_ADMIN_V1))) {
            // Salva os dados no banco e retorna ja com o ID da insercao
            return new ResponseEntity<>(baseMyService.saveOrUpdateAdmin(entity), HttpStatus.OK);
        } else {
            //return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            throw new BaseMyException(DefaultMessageConfiguration.BAD_REQUEST + " - URL:" + request.getRequestURI());
        }
    }

    @RequestMapping(path = {"/{id}"}, method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> deleteById(@PathVariable("id") Integer id, HttpServletRequest request) {
        // Checo qual eh a rota que esta fazendo a solicitacao
        if ((request.getRequestURI() != null) && (request.getRequestURI().toLowerCase().contains(MAPPING_CLIENT_V1))) {
            // Retorna o status OK junto com os dados coletado no banco de dados
            return new ResponseEntity<>(baseMyService.deleteClient(id), HttpStatus.OK);

            // Checa se eh um rota para acessar o banco de dados de administracao do webservice
        } else if ((request.getRequestURI() != null) && (request.getRequestURI().toLowerCase().contains(MAPPING_ADMIN_V1))) {
            // Delete o registro
            baseMyService.deleteAdmin(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            //return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            throw new BaseMyException(DefaultMessageConfiguration.BAD_REQUEST + " - URL:" + request.getRequestURI());
        }
    }

}
