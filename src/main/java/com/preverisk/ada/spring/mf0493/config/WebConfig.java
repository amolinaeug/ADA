package com.preverisk.ada.spring.mf0493.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
      
        registry.addResourceHandler("/files/**")
                .addResourceLocations("file:uploads/");
    }
}