package com.springboot.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class InjectionApp {

    public static void main(String[] args) {
        ApplicationContext ctx=new AnnotationConfigApplicationContext(InjectionApp.class);

        Target t=(Target) ctx.getBean("targetByName");
        Target t1=(Target) ctx.getBean("targetByType");
        Target t2=(Target) ctx.getBean("targetConstructor");

    }
}
