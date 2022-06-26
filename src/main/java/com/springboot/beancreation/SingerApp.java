package com.springboot.beancreation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class SingerApp {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(SingerApp.class);
        SingerWithInterface singer=(SingerWithInterface) context.getBean("singerWithInterface");

        System.out.println(singer);

        SingerWithPostConstruct singerWithPostConstruct=(SingerWithPostConstruct) context.getBean("singerWithPostConstruct");
        System.out.println(singerWithPostConstruct);

        SingerWithInitMethod singerWithInitMethod=(SingerWithInitMethod) context.getBean("singerWithInitMethod");
        System.out.println(singerWithInitMethod);
    }
}
