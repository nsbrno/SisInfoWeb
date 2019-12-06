/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nsbruno.sisinfo.configuration;

import br.com.nsbruno.sisinfo.interceptior.AuthorizingInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Classe de configuração para aceitar os interceptores.
 *  
 * @author Nogueira
 */
@Component
public class InterceptorConfiguration implements WebMvcConfigurer{
    
    @Autowired
    AuthorizingInterceptor authorizingInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry
                .addInterceptor(authorizingInterceptor)
                .addPathPatterns("/client/v1/**", "/admin/v1/**")
                .excludePathPatterns("/admin/v1/Properties");
    }
    
    
    
}
