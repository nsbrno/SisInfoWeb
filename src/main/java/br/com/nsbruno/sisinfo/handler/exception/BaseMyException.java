/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nsbruno.sisinfo.handler.exception;

/**
 * TODO--Colocar aqui o insert de log no banco de dados e no arquivo de servidor
 * @author Nogueira
 */
public class BaseMyException extends RuntimeException{

    public BaseMyException(String message) {
        super(message);
    }

    public BaseMyException(String message, Throwable cause) {
        super(message, cause);
    }

    public BaseMyException(Exception e) {
        super(e);
    }
    
    
    
}
