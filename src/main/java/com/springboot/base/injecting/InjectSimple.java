package com.springboot.base.injecting;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component("injectSimple")
public class InjectSimple {

    @Value("10")
    private int id;
    @Value("Seyda Özdemir")
    private String name;
    @Value("true")
    private boolean active;
    @Value("10000")
    private double salary;

    public static void main(String[] args) {
        ApplicationContext ctx=new AnnotationConfigApplicationContext(InjectSimple.class);
        InjectSimple injectSimple=(InjectSimple) ctx.getBean("injectSimple");
        System.out.println(injectSimple);
    }

    @Override
    public String toString() {
        return "InjectSimple{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", active=" + active +
                ", salary=" + salary +
                '}';
    }
}
