package com.springboot.properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource(value = "classpath:message.properties")
public class PropertyConfig {
    @Autowired
    Environment env;

    @Bean
    public MessageProvider messageProvider(){
        return new MessageProvider(env.getProperty("message"));
    }

    @Bean
    public MessageRenderer messageRenderer(){
        return new MessageRenderer(messageProvider());
    }
}
