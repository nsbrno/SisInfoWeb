/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nsbruno.sisinfo.handler.exception;

import br.com.nsbruno.sisinfo.model.ErrorMessageEntity;

/**
 *
 * @author Nogueira
 */
public class BaseMyException extends RuntimeException{
    
    private ErrorMessageEntity errorMessage;

    public BaseMyException(ErrorMessageEntity errorMessage) {
        this.errorMessage = errorMessage;
    }
}
