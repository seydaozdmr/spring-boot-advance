package com.springboot.base;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BaseConfig {

    @Bean
    public String artist(){
        return "Tarkan";
    }
}
