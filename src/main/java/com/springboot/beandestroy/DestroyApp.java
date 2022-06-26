package com.springboot.beandestroy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Map;

@ComponentScan
public class DestroyApp {
    public static void main(String[] args) throws Exception {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(DestroyApp.class);
        FileService service=(FileService) applicationContext.getBean("fileService");
        service.writeNumbers();
        applicationContext.getBeansWithAnnotation(Service.class).forEach((k,v)-> System.out.println(k+": "+v));

        service.destroy();


    }
}
