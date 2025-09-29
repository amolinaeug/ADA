package com.preverisk.ada.spring.mf0493.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import com.preverisk.ada.spring.mf0493.entidades.Visita;

@Configuration
public class RestConfig implements RepositoryRestConfigurer {

    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
    	
    	System.out.println("Hello, World!");

        config.exposeIdsFor(Visita.class);
    }
}
