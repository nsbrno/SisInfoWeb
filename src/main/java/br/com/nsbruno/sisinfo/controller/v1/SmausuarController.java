/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nsbruno.sisinfo.controller.v1;

import br.com.nsbruno.sisinfo.beans.PageBeans;
import br.com.nsbruno.sisinfo.beans.PageableBeans;
import br.com.nsbruno.sisinfo.configuration.DefaultMessageConfiguration;
import br.com.nsbruno.sisinfo.configuration.GeneralConfiguration;
import br.com.nsbruno.sisinfo.controller.BaseMyController;
import static br.com.nsbruno.sisinfo.controller.BaseMyController.MAPPING_ADMIN_V1;
import static br.com.nsbruno.sisinfo.controller.BaseMyController.MAPPING_CLIENT_V1;
import br.com.nsbruno.sisinfo.function.CustomFunction;
import br.com.nsbruno.sisinfo.handler.exception.BaseMyException;
import br.com.nsbruno.sisinfo.model.ErrorMessageEntity;
import br.com.nsbruno.sisinfo.model.SmausuarEntity;
import br.com.nsbruno.sisinfo.service.BaseMyService;
import br.com.nsbruno.sisinfo.service.SmausuarService;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.HandlerMapping;

/**
 *
 * @author Nogueira
 */
@RestController
@RequestMapping(value = {BaseMyController.MAPPING_CLIENT_V1 + "/Smausuar", BaseMyController.MAPPING_ADMIN_V1 + "/Smausuar"})
public class SmausuarController extends BaseMyController<SmausuarService, SmausuarEntity> {

    @RequestMapping(value = {"/Authentication"}, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> save(@RequestBody String entity, HttpServletRequest request) {
        ErrorMessageEntity errorMessageEntity = new ErrorMessageEntity();
        errorMessageEntity.setTimestamp(ZonedDateTime.now().toString());
        errorMessageEntity.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
        errorMessageEntity.setError(HttpStatus.INTERNAL_SERVER_ERROR.name());
        errorMessageEntity.setPath((String) request.getAttribute(HandlerMapping.PATH_WITHIN_HANDLER_MAPPING_ATTRIBUTE));
        try {
            // Checa qual eh a rota que esta fazendo a solicitacao
            if ((request.getRequestURI() != null) && (request.getRequestURI().toLowerCase().contains(MAPPING_CLIENT_V1))) {
                // Checa se foi passado o usuario de autenticação, o Basic Auth, no Header da requisição
                if ((request.getHeader("Authorization") != null) && (request.getHeader("Authorization").toLowerCase().startsWith("basic"))) {
                    // Cria uma paginação padrao pois vai retornar apena um elemento que é o nome do usuário e senha criptografados
                    PageableBeans pageable = new PageableBeans();
                    pageable.setPageNumber(0);
                    pageable.setPageSize(BaseMyService.PAGE_SIZE);
                    // Cria uma lista para salvar a criptografia
                    List<String> userCript = new ArrayList<>();
                    // Adiciona na lista a Authorization com a criptografia
                    userCript.add(Arrays.toString(new CustomFunction().encryptDecrypt(CustomFunction.KEY_ENCRYPT, request.getHeader("Authorization"), GeneralConfiguration.CHAVE_DEFAULT_ENCRYPT_DECRYPT)));
                    PageBeans page = new PageBeans(pageable, 1, 1, userCript);
                    return new ResponseEntity<>(page, HttpStatus.OK);
                } else {
                    errorMessageEntity.setMessage(DefaultMessageConfiguration.USER_PASSWORD_NOT_PASSED);
                    return new ResponseEntity<>(errorMessageEntity, HttpStatus.UNAUTHORIZED);
                }
                // Checa se a URL contem "admin" para pesquisar no banco do servidor webservice, o admin do sistema
            } else if ((request.getRequestURI() != null) && (request.getRequestURI().toLowerCase().contains(MAPPING_ADMIN_V1))) {
                //return new ResponseEntity<>(baseMyService.getAll(pageable), HttpStatus.OK);
                return new ResponseEntity<>(baseMyService.getAllAdmin(null), HttpStatus.OK);
            } else {
                //return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
                throw new BaseMyException(DefaultMessageConfiguration.BAD_REQUEST + " - URL:" + request.getRequestURI());
            }
        } catch (BaseMyException ex) {
            Logger.getLogger(BaseMyController.class.getName()).log(Level.SEVERE, null, ex);
            errorMessageEntity.setMessage((ex.getLocalizedMessage() != null) ? ex.getLocalizedMessage() : ex.toString());
            return new ResponseEntity<>(errorMessageEntity, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
