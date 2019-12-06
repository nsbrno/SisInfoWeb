/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nsbruno.sisinfo.controller.admin.v1;

import br.com.nsbruno.sisinfo.configuration.DefaultMessageConfiguration;
import br.com.nsbruno.sisinfo.controller.BaseMyController;
import br.com.nsbruno.sisinfo.model.ErrorMessageEntity;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Level;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.HandlerMapping;

/**
 * Document : PropertiesController Created on : 08/11/2019, 00:31:28 Author :
 * Bruno Nogueira Silva
 *
 * @author Nogueira
 */
@RestController
@RequestMapping( value = {BaseMyController.MAPPING_ADMIN_V1 + "/Properties"})
public class PropertiesController {

    @Autowired
    private Environment environment;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getAllProps(Pageable pageable, HttpServletRequest request) {
        // Variavel para retorna um erro caso necessario
        ErrorMessageEntity errorMessageEntity = new ErrorMessageEntity();
        errorMessageEntity.setTimestamp(new Date());
        errorMessageEntity.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
        errorMessageEntity.setError(HttpStatus.INTERNAL_SERVER_ERROR.name());
        errorMessageEntity.setPath((String) request.getAttribute(HandlerMapping.PATH_WITHIN_HANDLER_MAPPING_ATTRIBUTE));
        try {
            // Pega o arquivo de propriedades
            Resource resource = new ClassPathResource("application.properties");
            // Checa se achou o arquivo
            if (resource != null) {
                // Pega tosa as propriedade do arquivo
                Properties props = PropertiesLoaderUtils.loadProperties(resource);
                // Checa se foi achado alguma propriedade
                if ((props != null) && (props.size() > 0)) {
                    // Cria uma lista para retornar como page
                    List<Object> listProps = new ArrayList<>();
                    Map<String, String> someMap = new HashMap<>();
                    // Passa por todas as propriedades
                    for (Object key : props.keySet()) {
                        someMap.put(key.toString(), props.getProperty(key.toString()));
                    }
                    listProps.add(0, someMap);
                    // Cria uma page para retorna no padrao do spring boot
                    Page<Object> page = new PageImpl<Object>(listProps);
                    return new ResponseEntity<>(page, HttpStatus.OK);
                } else {
                    errorMessageEntity.setMessage(DefaultMessageConfiguration.FILE_CONFIG_NOT_PROPS);
                    return new ResponseEntity<>(errorMessageEntity, HttpStatus.INTERNAL_SERVER_ERROR);
                }
            } else {
                errorMessageEntity.setMessage(DefaultMessageConfiguration.FILE_CONFIG_NOT_FOUND);
                return new ResponseEntity<>(errorMessageEntity, HttpStatus.INTERNAL_SERVER_ERROR);
            }
        } catch (Exception e) {
            Logger.getLogger(PropertiesController.class.getName()).log(Level.SEVERE, null, e);
            errorMessageEntity.setMessage((e.getLocalizedMessage() != null) ? e.getLocalizedMessage() : e.toString());
            return new ResponseEntity<>(errorMessageEntity, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(path = {"/{key}"}, method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getOneById(@PathVariable("key") String key, HttpServletRequest request) {
        // Variavel para retorna um erro caso necessario
        ErrorMessageEntity errorMessageEntity = new ErrorMessageEntity();
        errorMessageEntity.setTimestamp(new Date());
        errorMessageEntity.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
        errorMessageEntity.setError(HttpStatus.INTERNAL_SERVER_ERROR.name());
        errorMessageEntity.setPath((String) request.getAttribute(HandlerMapping.PATH_WITHIN_HANDLER_MAPPING_ATTRIBUTE));
        try {
            if ((key != null) && (!key.isEmpty())) {
                Resource resource = new ClassPathResource("application.properties");
                // Checa se achou o arquivo
                if (resource != null) {
                    // Pega tosa as propriedade do arquivo
                    Properties props = PropertiesLoaderUtils.loadProperties(resource);
                    // Checa se foi achado alguma propriedade
                    if ((props != null) && (props.size() > 0)) {
                        // Checa se a chave passada no parametro ja existe
                        if (props.containsKey(key)) {
                            Map<String, String> someMap = new HashMap<>();
                            someMap.put(key, props.getProperty(key));
                            return new ResponseEntity<>(someMap, HttpStatus.OK);
                        } else {
                            errorMessageEntity.setMessage(DefaultMessageConfiguration.ERROR_NOT_FOUND_KEY_PROPERTIE);
                            return new ResponseEntity<>(errorMessageEntity, HttpStatus.INTERNAL_SERVER_ERROR);
                        }
                    } else {
                        errorMessageEntity.setMessage(DefaultMessageConfiguration.FILE_CONFIG_NOT_PROPS);
                        return new ResponseEntity<>(errorMessageEntity, HttpStatus.INTERNAL_SERVER_ERROR);
                    }
                } else {
                    errorMessageEntity.setMessage(DefaultMessageConfiguration.FILE_CONFIG_NOT_FOUND);
                    return new ResponseEntity<>(errorMessageEntity, HttpStatus.INTERNAL_SERVER_ERROR);
                }
            } else {
                errorMessageEntity.setMessage(DefaultMessageConfiguration.NOT_PARAM);
                return new ResponseEntity<>(errorMessageEntity, HttpStatus.INTERNAL_SERVER_ERROR);
            }
        } catch (Exception e) {
            Logger.getLogger(PropertiesController.class.getName()).log(Level.SEVERE, null, e);
            errorMessageEntity.setMessage((e.getLocalizedMessage() != null) ? e.getLocalizedMessage() : e.toString());
            return new ResponseEntity<>(errorMessageEntity, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT}, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> save(@RequestBody String entity, HttpServletRequest request) {
        ErrorMessageEntity errorMessageEntity = new ErrorMessageEntity();
        errorMessageEntity.setTimestamp(new Date());
        errorMessageEntity.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
        errorMessageEntity.setError(HttpStatus.INTERNAL_SERVER_ERROR.name());
        errorMessageEntity.setPath((String) request.getAttribute(HandlerMapping.PATH_WITHIN_HANDLER_MAPPING_ATTRIBUTE));
        try {
            JsonObject dadosBody = new Gson().fromJson((String) entity, JsonObject.class);
            // Checa se foi passado alguns dados
            if ((dadosBody != null) && (dadosBody.has("key")) && (dadosBody.has("value"))) {
                // Pega o arquivo de propriedades
                Resource resource = new ClassPathResource("application.properties");
                // Checa se achou o arquivo
                if (resource != null) {
                    // Pega tosa as propriedade do arquivo
                    Properties props = PropertiesLoaderUtils.loadProperties(resource);
                    // Checa se foi achado alguma propriedade
                    if ((props != null) && (props.size() > 0)) {

                        // Checa se a chave passada no parametro ja existe
                        if (props.containsKey(dadosBody.get("key").getAsString())) {
                            // Atualiza propriedade
                            props.replace(dadosBody.get("key").getAsString(), dadosBody.get("value").getAsString());
                        } else {
                            // Adiciona a nova propriedade
                            props.setProperty(dadosBody.get("key").getAsString(), dadosBody.get("value").getAsString());
                        }
                        // Salva todas as propriedades no arquivo
                        props.store(new FileOutputStream(resource.getFile()), null);
                        // Cria um Map pra pegar a nova prop direto no arquivo application.properties e retornar para o REST API
                        Map<String, String> someMap = new HashMap<>();
                        someMap.put(dadosBody.get("key").getAsString(),
                                PropertiesLoaderUtils.loadProperties(resource).getProperty(dadosBody.get("key").getAsString()));
                        Logger.getLogger(PropertiesController.class.getName()).log(Level.INFO, 
                                    " - Chave/key: " + dadosBody.get("key").getAsString() + 
                                    " - Valor: " +PropertiesLoaderUtils.loadProperties(resource).getProperty(dadosBody.get("key").getAsString()));
                        return new ResponseEntity<>(someMap, HttpStatus.OK);
                    } else {
                        errorMessageEntity.setMessage(DefaultMessageConfiguration.FILE_CONFIG_NOT_PROPS);
                        return new ResponseEntity<>(errorMessageEntity, HttpStatus.INTERNAL_SERVER_ERROR);
                    }
                } else {
                    errorMessageEntity.setMessage(DefaultMessageConfiguration.FILE_CONFIG_NOT_FOUND);
                    return new ResponseEntity<>(errorMessageEntity, HttpStatus.INTERNAL_SERVER_ERROR);
                }
            } else {
                errorMessageEntity.setMessage(DefaultMessageConfiguration.NOT_PARAM);
                return new ResponseEntity<>(errorMessageEntity, HttpStatus.INTERNAL_SERVER_ERROR);
            }

        } catch (JsonSyntaxException | IOException ex) {
            Logger.getLogger(PropertiesController.class.getName()).log(Level.SEVERE, null, ex);
            errorMessageEntity.setMessage((ex.getLocalizedMessage() != null) ? ex.getLocalizedMessage() : ex.toString());
            return new ResponseEntity<>(errorMessageEntity, HttpStatus.INTERNAL_SERVER_ERROR);
        } catch (Exception ex) {
            Logger.getLogger(PropertiesController.class.getName()).log(Level.SEVERE, null, ex);
            errorMessageEntity.setMessage((ex.getLocalizedMessage() != null) ? ex.getLocalizedMessage() : ex.toString());
            return new ResponseEntity<>(errorMessageEntity, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(path = {"/{key}"}, method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> deleteById(@PathVariable("key") String key, HttpServletRequest request) {
        ErrorMessageEntity errorMessageEntity = new ErrorMessageEntity();
        errorMessageEntity.setTimestamp(new Date());
        errorMessageEntity.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
        errorMessageEntity.setError(HttpStatus.INTERNAL_SERVER_ERROR.name());
        errorMessageEntity.setPath((String) request.getAttribute(HandlerMapping.PATH_WITHIN_HANDLER_MAPPING_ATTRIBUTE));
        try {
            // Checa se foi passado alguns dados
            if ((key != null) && (!key.isEmpty())) {
                // Pega o arquivo de propriedades
                Resource resource = new ClassPathResource("application.properties");
                // Checa se achou o arquivo
                if (resource != null) {
                    // Pega tosa as propriedade do arquivo
                    Properties props = PropertiesLoaderUtils.loadProperties(resource);
                    // Checa se foi achado alguma propriedade
                    if ((props != null) && (props.size() > 0)) {
                        // Checa se a chave passada no parametro ja existe
                        if (props.containsKey(key)) {
                            // Deleta propriedade
                            Object ob = props.remove(key);
                            // Salva todas as propriedades no arquivo
                            props.store(new FileOutputStream(resource.getFile()), null);
                            
                            Logger.getLogger(PropertiesController.class.getName()).log(Level.INFO, "Chave deletada: " + key);
                            // Retorna apenas um ok de sucesso na delecao
                            return new ResponseEntity<>(HttpStatus.OK);
                        } else {
                            errorMessageEntity.setMessage(DefaultMessageConfiguration.ERROR_NOT_FOUND_KEY_PROPERTIE);
                            Logger.getLogger(PropertiesController.class.getName()).log(Level.INFO, 
                                    DefaultMessageConfiguration.ERROR_NOT_FOUND_KEY_PROPERTIE + " - Chave/key: " + key);
                            return new ResponseEntity<>(errorMessageEntity, HttpStatus.INTERNAL_SERVER_ERROR);
                        }

                    } else {
                        errorMessageEntity.setMessage(DefaultMessageConfiguration.FILE_CONFIG_NOT_PROPS);
                        return new ResponseEntity<>(errorMessageEntity, HttpStatus.INTERNAL_SERVER_ERROR);
                    }
                } else {
                    errorMessageEntity.setMessage(DefaultMessageConfiguration.FILE_CONFIG_NOT_FOUND);
                    return new ResponseEntity<>(errorMessageEntity, HttpStatus.INTERNAL_SERVER_ERROR);
                }
            } else {
                errorMessageEntity.setMessage(DefaultMessageConfiguration.NOT_PARAM);
                return new ResponseEntity<>(errorMessageEntity, HttpStatus.INTERNAL_SERVER_ERROR);
            }
        } catch (JsonSyntaxException | IOException ex) {
            Logger.getLogger(PropertiesController.class.getName()).log(Level.SEVERE, null, ex);
            errorMessageEntity.setMessage((ex.getLocalizedMessage() != null) ? ex.getLocalizedMessage() : ex.toString());
            return new ResponseEntity<>(errorMessageEntity, HttpStatus.INTERNAL_SERVER_ERROR);
        } catch (Exception ex) {
            Logger.getLogger(PropertiesController.class.getName()).log(Level.SEVERE, null, ex);
            errorMessageEntity.setMessage((ex.getLocalizedMessage() != null) ? ex.getLocalizedMessage() : ex.toString());
            return new ResponseEntity<>(errorMessageEntity, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
