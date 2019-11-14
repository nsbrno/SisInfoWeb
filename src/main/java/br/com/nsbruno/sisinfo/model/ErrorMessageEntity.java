/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nsbruno.sisinfo.model;

import java.util.Date;
import lombok.Data;

/**
 * Document : ErrorMessageEntity Created on : 08/11/2019, 18:00:22 Author :
 * Bruno Nogueira Silva
 *
 * @author Nogueira
 */
@Data
public class ErrorMessageEntity{

    private Date timestamp;
    private int status;
    private String error;
    private String message;
    private String trace;
    private String path;
}
