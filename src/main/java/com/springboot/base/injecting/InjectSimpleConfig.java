package com.springboot.base.injecting;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration("injectSimpleSpel")
@PropertySource("classpath:application.properties")
public class InjectSimpleConfig {
    @Value("${inject.id}")
    private String id;
    @Value("${inject.name}")
    private String name;
    @Value("#{new Boolean('${inject.active}')}")
    private boolean active;
    @Value("${inject.salary}")
    private double salary;

    public static void main(String[] args) {
        ApplicationContext ctx=new AnnotationConfigApplicationContext(InjectSimpleConfig.class);
        InjectSimpleConfig injectSimpleConfig=(InjectSimpleConfig) ctx.getBean("injectSimpleSpel");
        System.out.println(injectSimpleConfig);
    }

    @Override
    public String toString() {
        return "InjectSimpleConfig{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", active=" + active +
                ", salary=" + salary +
                '}';
    }
}
