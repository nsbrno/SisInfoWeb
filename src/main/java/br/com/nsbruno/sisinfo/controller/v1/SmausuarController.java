/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nsbruno.sisinfo.controller.v1;

import br.com.nsbruno.sisinfo.configuration.DefaultMessageConfiguration;
import br.com.nsbruno.sisinfo.controller.BaseMyController;
import br.com.nsbruno.sisinfo.model.ErrorMessageEntity;
import br.com.nsbruno.sisinfo.model.SmausuarEntity;
import br.com.nsbruno.sisinfo.service.SmausuarService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
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
@RequestMapping("v1/Smausuar")
public class SmausuarController extends BaseMyController<SmausuarService, SmausuarEntity> {

    @RequestMapping(value = {"/Authentication"}, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> save(@RequestBody String entity, HttpServletRequest request) {
        ErrorMessageEntity errorMessageEntity = new ErrorMessageEntity();
        errorMessageEntity.setTimestamp(new Date());
        errorMessageEntity.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
        errorMessageEntity.setError(HttpStatus.INTERNAL_SERVER_ERROR.name());
        errorMessageEntity.setPath((String) request.getAttribute(HandlerMapping.PATH_WITHIN_HANDLER_MAPPING_ATTRIBUTE));
        try {
            // Checa se foi passado alguns dados de usuario e senha
            if ((request.getUserPrincipal() != null) && (request.getUserPrincipal().getName() != null) && (!request.getUserPrincipal().getName().isEmpty())) {
                UserDetails user = null; // baseMyService.loadUserByUsername(request.getUserPrincipal().getName());
                // Checa se retornou algum usuario
                if ((user != null) && (user.getUsername() != null) && (!user.getUsername().isEmpty())) {
                    //BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
                    //String returnEncode = passwordEncoder.encode(entity);
                    
                    // Cria uma lista para retornar como page
                    List<UserDetails> listUsers = new ArrayList<>();
                    listUsers.add(0, user);
                    // Cria uma page para retorna no padrao do spring boot
                    Page<UserDetails> page = new PageImpl<UserDetails>(listUsers);
                    return new ResponseEntity<>(page, HttpStatus.OK);
                } else {
                    errorMessageEntity.setMessage(DefaultMessageConfiguration.USER_NOT_FOUND);
                    return new ResponseEntity<>(errorMessageEntity, HttpStatus.INTERNAL_SERVER_ERROR);
                }
            } else {
                errorMessageEntity.setMessage(DefaultMessageConfiguration.NOT_PARAM + " (username, password).");
                return new ResponseEntity<>(errorMessageEntity, HttpStatus.INTERNAL_SERVER_ERROR);
            }
        } catch (Exception ex) {
            Logger.getLogger(BaseMyController.class.getName()).log(Level.SEVERE, null, ex);
            errorMessageEntity.setMessage((ex.getLocalizedMessage() != null) ? ex.getLocalizedMessage() : ex.toString());
            return new ResponseEntity<>(errorMessageEntity, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
