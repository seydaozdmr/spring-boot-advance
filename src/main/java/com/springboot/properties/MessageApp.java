package com.springboot.properties;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MessageApp {
    public static void main(String[] args) {
        ApplicationContext ctx=new AnnotationConfigApplicationContext(PropertyConfig.class);

        MessageRenderer messageRenderer=(MessageRenderer) ctx.getBean("messageRenderer");
        messageRenderer.render();
    }
}
