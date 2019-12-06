/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nsbruno.sisinfo.interceptior;

import br.com.nsbruno.sisinfo.configuration.DefaultMessageConfiguration;
import br.com.nsbruno.sisinfo.model.ErrorMessageEntity;
import com.google.gson.Gson;
import br.com.nsbruno.sisinfo.function.CustomFunction;
import br.com.nsbruno.sisinfo.model.CfaclifoEntity;
import br.com.nsbruno.sisinfo.model.SmadispoEntity;
import br.com.nsbruno.sisinfo.repository.BaseMyRepositoryImpl;
import br.com.nsbruno.sisinfo.service.CfaclifoService;
import br.com.nsbruno.sisinfo.service.SmadispoService;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.Principal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Base64;
import java.util.Date;
import java.util.Enumeration;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.HandlerMapping;

/**
 *
 * @author Nogueira
 */
@Component
public class AuthorizingInterceptor implements HandlerInterceptor {

    @Autowired
    private SmadispoService smadispoService;

    @Autowired
    private CfaclifoService cfaclifoService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        ErrorMessageEntity errorMessageEntity = new ErrorMessageEntity();
        errorMessageEntity.setTimestamp(new Date());
        errorMessageEntity.setStatus(HttpStatus.UNAUTHORIZED.value());
        errorMessageEntity.setError(HttpStatus.UNAUTHORIZED.name());
        errorMessageEntity.setPath((String) request.getAttribute(HandlerMapping.PATH_WITHIN_HANDLER_MAPPING_ATTRIBUTE));
        response.setContentType(MediaType.APPLICATION_JSON_VALUE);
        // Variavel para manipular a conexao com o banco de dados
        Connection connection = null;
        try {
            // Checa se foi passado o dispositivo
            if (request.getHeader(CustomFunction.KEY_DEVICE) != null) {
                if ((request.getHeader("Authorization") != null) && (request.getHeader("Authorization").toLowerCase().startsWith("basic"))) {
                    // Usa um metodo para pegar os dados de usuario e senha
                    Map<String, String> auth = new CustomFunction().getUserAndPassowordFromAuth(request);
                    // Checa pegou os dodos de autorizacao
                    if (auth.size() > 0) {
                        // Pega os dados do dispositivo
                        SmadispoEntity smadispoEntity = smadispoService.getOneByIndentificacao(request.getHeader(CustomFunction.KEY_DEVICE));
                        // Chega se retornou algum dispositivo
                        if (smadispoEntity != null) {
                            // Checa se o dispositivo esta inativo
                            if ((smadispoEntity.getAtivo() != null) && (smadispoEntity.getAtivo().equalsIgnoreCase("0"))) {
                                response.setStatus(HttpStatus.UNAUTHORIZED.value());
                                errorMessageEntity.setMessage(DefaultMessageConfiguration.DEVICE_DISABLE);
                                response.getWriter().write(new Gson().toJson(errorMessageEntity));
                                return false;
                            }
                            // Pega os dados do cliente para ver em qual servidor eh pra se conectar
                            CfaclifoEntity cfaclifoEntity = cfaclifoService.getOneByIdCfaclifo(smadispoEntity.getIdCfaclifo());
                            // Checa se tem o cliente cadastrado
                            if (cfaclifoEntity != null) {
                                // Checa se o cliente esta inativo
                                if ((smadispoEntity.getAtivo() != null) && (smadispoEntity.getAtivo().equalsIgnoreCase("0"))) {
                                    response.setStatus(HttpStatus.UNAUTHORIZED.value());
                                    errorMessageEntity.setMessage(DefaultMessageConfiguration.CLIENT_DISABLE);
                                    response.getWriter().write(new Gson().toJson(errorMessageEntity));
                                    return false;
                                }
                                Class.forName(BaseMyRepositoryImpl.DRIVE_FIREBIRD);
                                connection = DriverManager.getConnection(
                                        BaseMyRepositoryImpl.PROTOCOL_FIREBIRD + ":" + cfaclifoEntity.getIpServidorSisinfo() + "/" + cfaclifoEntity.getPortaBancoSisinfo() + ":" + cfaclifoEntity.getCaminhoBancoSisinfo() + "?" + BaseMyRepositoryImpl.PARAM_CONNECTION_FIREBIRD,
                                        auth.get(CustomFunction.KEY_USERNAME),
                                        auth.get(CustomFunction.KEY_PASSWORD));
                                //System.out.println("#####  DEU CERTO #######");
                                // Checa se tem alguma conexao aberta. Caso esteja aberta significa que conectou com sucesso
                                return ((connection != null) && (!connection.isClosed()));
                            } else {
                                response.setStatus(HttpStatus.UNAUTHORIZED.value());
                                errorMessageEntity.setMessage(DefaultMessageConfiguration.CLIENT_NOT_FOUND);
                                response.getWriter().write(new Gson().toJson(errorMessageEntity));
                                return false;
                            }

                        } else {
                            response.setStatus(HttpStatus.UNAUTHORIZED.value());
                            errorMessageEntity.setMessage(DefaultMessageConfiguration.DEVICE_NOT_FOUND);
                            response.getWriter().write(new Gson().toJson(errorMessageEntity));
                            return false;
                        }
                    } else {
                        response.setStatus(HttpStatus.UNAUTHORIZED.value());
                        errorMessageEntity.setMessage("O Header Authorization esta vazio, nem o usename e nem o password foi passado no header.");
                        response.getWriter().write(new Gson().toJson(errorMessageEntity));
                        return false;
                    }
                } else {
                    response.setStatus(HttpStatus.UNAUTHORIZED.value());
                    errorMessageEntity.setMessage(DefaultMessageConfiguration.USER_PASSWORD_NOT_PASSED);
                    response.getWriter().write(new Gson().toJson(errorMessageEntity));
                    return false;
                }
            } else {
                response.setStatus(HttpStatus.UNAUTHORIZED.value());
                errorMessageEntity.setMessage(DefaultMessageConfiguration.DEVICE_NOT_PASSED_HEADER);
                response.getWriter().write(new Gson().toJson(errorMessageEntity));
                return false;
            }
        } catch (Exception ex) {
            response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            errorMessageEntity.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            errorMessageEntity.setError(HttpStatus.INTERNAL_SERVER_ERROR.name());
            errorMessageEntity.setMessage((ex.getLocalizedMessage() != null) ? ex.getLocalizedMessage() : ex.getMessage());
            response.getWriter().write(new Gson().toJson(errorMessageEntity));
            return false;
        } finally {
            if ((connection != null)) {
                connection.close();
            }
        }
    }

}
