/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nsbruno.sisinfo.configuration;

import br.com.nsbruno.sisinfo.service.SmausuarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

/**
 *
 * @author Bruno Nogueira Silva
 */
//@Configuration
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

//    @Autowired
//    private SmausuarService smausuarService;
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        /**TODO--Deletar todos esses comentarios apos ter certeza que os REST API vai pedir autenticação.
//         * http
//                .authorizeRequests()
//                .anyRequest().permitAll()
//                .and()
//                .csrf().disable()
//                //.anyRequest().authenticated()
//                //.antMatchers("/assets/**").permitAll()
//                //.antMatchers("/login").permitAll()
//                //.antMatchers("/v1/**").authenticated()
//                //.antMatchers(HttpMethod.DELETE, "/v1/**").hasAuthority("ROLE_ADMIN")
//                //.and()
//                .logout().logoutUrl("/logout")
//                .and()
//                .httpBasic();*/
//        
//        
//        /**http
//                .authorizeRequests()
//                .antMatchers("/assets/**", "/third-party/**", "/logout", "/login").permitAll()
//                .anyRequest().authenticated()
//                .antMatchers(HttpMethod.DELETE, "/v1/**").hasAuthority("ROLE_ADMIN")
//                .and()
//                .formLogin().loginPage("/login")
//                .and()
//                .logout().logoutUrl("/logout")
//                .and()
//                .httpBasic()
//                .and()
//                .csrf()
//                    .csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
//                    .ignoringAntMatchers("/actuator/**", "/instances", "/instances/**", "/logout")
//                ;*/
//        
//                        
//        /**SavedRequestAwareAuthenticationSuccessHandler successHandler = new SavedRequestAwareAuthenticationSuccessHandler();
//        successHandler.setTargetUrlParameter("redirectTo");
//        successHandler.setDefaultTargetUrl(adminContextPath + "/");
//
//        http.authorizeRequests()
//                .antMatchers("/assets/**",
//                             "/login",
//                             "/Home").permitAll()
//                .antMatchers(HttpMethod.DELETE, "/v1/**").hasRole("ADMIN")
//                .anyRequest().authenticated()
//                .and()
//                .formLogin()//.loginPage("/login").successHandler(successHandler)
//                .and()
//                .logout().logoutUrl("/logout").logoutSuccessUrl("/Home")
//                .and()
//                .httpBasic()
//                .and()
//                .csrf()//.disable()
//                .csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
//                    .ignoringAntMatchers("/v1/**", "/instances", "/actuator/**", adminContextPath + "/instances", adminContextPath + "/actuator/**")
//                .and()
//                .rememberMe()
//                ;*/
//        http
//                .antMatcher("/**")
//                .authorizeRequests()
//                .antMatchers("/login",
//                             "/assets/**",
//                             "/public/bundle.js",
//                             "/Home/**",
//                             "/About/**",
//                             "/v1/Properties/**").permitAll()
//                .antMatchers(HttpMethod.DELETE, "/v1/**").hasRole("ADMIN")
//                .anyRequest().authenticated()
//                //.and()
//                //.formLogin()//.loginPage("/login").successHandler(successHandler)
//                //.and()
//                //.logout().logoutUrl("/logout").logoutSuccessUrl("/Home")
//                .and()
//                .httpBasic()
//                .and()
//                .csrf()//.disable()
//                .csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
//                    .ignoringAntMatchers("/v1/**", "/instances", "/actuator/**", "/About")
//                .and()
//                .rememberMe()
//                ;
//        
//        
//        //http.authorizeRequests().anyRequest().permitAll().and().csrf().disable();
//    }
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(smausuarService).passwordEncoder(new BCryptPasswordEncoder());
//    }
}
