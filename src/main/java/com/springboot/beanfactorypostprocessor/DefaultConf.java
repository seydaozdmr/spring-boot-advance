package com.springboot.beanfactorypostprocessor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.yaml.snakeyaml.introspector.BeanAccess;

@Configuration
public class DefaultConf {
    @Bean
    public BeanA beanA(){
        return new BeanA();
    }
}
