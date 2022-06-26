package com.springboot.beancreation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

public class SingerWithInitMethod {
    private String name;
    private int age;

    public void init(){
        this.name="Tarkan";
        this.age=44;
    }


    @Configuration
    private static class Config {
        public Config(){}

        @Bean(initMethod = "init")
        public SingerWithInitMethod singerWithInitMethod(){
            return new SingerWithInitMethod();
        }
    }


    @Override
    public String toString() {
        return "SingerWithInitMethod{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
