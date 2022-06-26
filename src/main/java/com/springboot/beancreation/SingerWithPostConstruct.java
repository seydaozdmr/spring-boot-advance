package com.springboot.beancreation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class SingerWithPostConstruct {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    @Autowired
    public void setAge(int age) {
        this.age = age;
    }

    @Configuration
    private static class Config{
        public Config(){}

        @Bean
        public int age(){
            return 100;
        }
    }

    @PostConstruct
    public void init(){
        if(name==null)
            System.out.println("İsim alanı boş kalmıştır...");
    }

    @Override
    public String toString() {
        return "SingerWithPostConstruct{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
