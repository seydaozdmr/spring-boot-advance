package com.springboot.beanfactorypostprocessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class App {
    public static void main(String ... args){
        ApplicationContext context=new AnnotationConfigApplicationContext(App.class);
        BeanA beanA=(BeanA) context.getBean("beanA");
        System.out.println(beanA);
    }
}
