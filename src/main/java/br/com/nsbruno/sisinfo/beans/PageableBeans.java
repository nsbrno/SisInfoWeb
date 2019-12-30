/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nsbruno.sisinfo.beans;

import lombok.Data;


/**
 *
 * @author Nogueira
 */
@Data
public class PageableBeans {
    
    int pageNumber, // Numero da pagina atual
        pageSize; // Tamanho de elementos que contem dentro da pagina
    String sort;
    String where;

    public PageableBeans() {
    }
    
}
