/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nsbruno.sisinfo.configuration;

import br.com.nsbruno.sisinfo.repository.BaseMyRepositoryImpl;
import java.util.Properties;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.web.context.request.RequestContextListener;

/**
 *
 * @author Bruno Nogueira Silva
 */
@Configuration
@EnableJpaRepositories(
        repositoryImplementationPostfix = "Impl", 
        basePackages = {"br.com.nsbruno.sisinfo.repository"},
        repositoryBaseClass = BaseMyRepositoryImpl.class,
        transactionManagerRef = "jpaTransactionManager")
@ComponentScan(basePackages = {"br.com.nsbruno.sisinfo.model", "br.com.nsbruno.sisinfo.service", "br.com.nsbruno.sisinfo.repository"})
@EnableTransactionManagement
public class PersistenceJPAConfiguration {

    @Autowired
    private Environment environment;
    
    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(dataSource());
        em.setPackagesToScan(new String[]{
            "br.com.nsbruno.sisinfo", 
            "br.com.nsbruno.sisinfo.model"});
        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(vendorAdapter);
        em.setJpaProperties(additionalProperties());
        return em;
    }

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(environment.getProperty("spring.datasource.driver-class-name"));
        dataSource.setUrl(environment.getProperty("spring.datasource.url"));
        dataSource.setUsername(environment.getProperty("spring.datasource.username"));
        dataSource.setPassword(environment.getProperty("spring.datasource.password"));
        return dataSource;
    }
    
    @Bean
    public PlatformTransactionManager hibernateTransactionManager() {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
    transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());
        return transactionManager;
    }

    @Bean
    public PlatformTransactionManager jpaTransactionManager() {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());

        return transactionManager;
    }

    @Bean
    public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
        return new PersistenceExceptionTranslationPostProcessor();
    }

    Properties additionalProperties() {
        Properties properties = new Properties();
        properties.setProperty("hibernate.hbm2ddl.auto", environment.getProperty("spring.jpa.hibernate.ddl-auto"));
        properties.setProperty("hibernate.show_sql", environment.getProperty("spring.jpa.show-sql"));
        properties.setProperty("hibernate.dialect", environment.getProperty("spring.jpa.properties.hibernate.dialect"));
        properties.setProperty("hibernate.format_sql", "true");

        return properties;
    }

    @Bean
    public RequestContextListener requestContextListener() {
        return new RequestContextListener();
    }
}
