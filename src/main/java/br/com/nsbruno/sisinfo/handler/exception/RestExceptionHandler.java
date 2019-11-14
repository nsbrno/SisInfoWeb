/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.nsbruno.sisinfo.handler.exception;

import br.com.nsbruno.sisinfo.model.ErrorMessageEntity;
import java.util.Date;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * Document   : RestExceptionHandler
   Created on : 08/11/2019, 17:32:45
   Author     : Bruno Nogueira Silva
 * @author Nogueira
 */
@RestControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler{

    @ExceptionHandler(value = {Exception.class})
    public ResponseEntity<Object> handlerException(Exception ex, HttpHeaders headers, HttpStatus status, WebRequest request){
        
        ErrorMessageEntity errorMessageEntity = new ErrorMessageEntity();
        errorMessageEntity.setTimestamp(new Date());
        errorMessageEntity.setStatus(status.value());
        errorMessageEntity.setError(status.name());
        errorMessageEntity.setMessage((ex.getLocalizedMessage() == null ? ex.toString() : ex.getLocalizedMessage()));
        errorMessageEntity.setTrace(ex.getStackTrace().toString());
        errorMessageEntity.setPath("path aqui");
        String s1 = headers.getOrigin();
        return new ResponseEntity<>(errorMessageEntity, status);
    }
}
