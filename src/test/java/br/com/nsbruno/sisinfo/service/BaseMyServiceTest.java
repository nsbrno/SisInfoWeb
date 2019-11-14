/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.nsbruno.sisinfo.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Document   : BaseMyServiceTest
   Created on : 11/11/2019, 21:35:08
   Author     : Bruno Nogueira Silva
 * @author Nogueira
 */
@SpringBootTest
public class BaseMyServiceTest<S extends BaseMyService, E> {
    
    @Autowired
    S myService;
    
    @Test
    public void getOneByIdTest(Integer id){
        
    }
    
}
