package com.springboot.environments;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.MutablePropertySources;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class EnvironmentsExample {
    public static void main(String[] args) {
        ApplicationContext ctx= SpringApplication.run(EnvironmentsExample.class);
        ConfigurableEnvironment env=(ConfigurableEnvironment) ctx.getEnvironment();
        MutablePropertySources propertySources= env.getPropertySources();

        env.getSystemEnvironment().forEach((k,v)-> System.out.println(k+" : "+v));
        env.getSystemProperties().forEach((k,v)-> System.out.println(k+" : "+v));
        Map<String,Object> appMap=new HashMap<>();
        appMap.put("user.home","application_home");

        propertySources.addLast(new MapPropertySource("prospring5",appMap));
        System.out.println("user.home : "+System.getProperty("user.home"));
        System.out.println("JAVA_HOME : "+System.getenv("JAVA_HOME"));

        System.out.println("user.home : "+env.getProperty("user.home"));
        System.out.println("JAVA_HOME : "+env.getProperty("JAVA_HOME"));



    }

}
