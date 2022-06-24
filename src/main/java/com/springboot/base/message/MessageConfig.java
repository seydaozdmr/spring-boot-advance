package com.springboot.base.message;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfig {

//    @Bean
//    public MessageProvider messageProvider(){
//        return new HelloWorldMessageProvider();
//    }

    @Bean
    public String message(){
        return "Hello Java!";
    }

    @Bean
    public MessageProvider helloMessageProvider(){
        return new ConfigurableMessageProvider(message());
    }

    @Bean//("standartOutMessageRenderer")
    public MessageRenderer messageRenderer(){
        MessageRenderer messageRenderer=new StandartOutMessageRenderer();
        messageRenderer.setMessageProvider(helloMessageProvider());
        return messageRenderer;
    }
}
