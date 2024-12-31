package com.coudevi.config;

import com.coudevi.services.ContactoService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public ContactoService contactoService(){
        return new ContactoService();
    }
}

