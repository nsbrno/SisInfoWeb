/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nsbruno.sisinfo.handler.exception;

/**
 *
 * @author Nogueira
 */
public class BaseMyException extends RuntimeException{

    public BaseMyException(String message) {
        super(message);
    }
}
