package com.springboot.beancreation;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class SingerWithInterface implements InitializingBean {
    private String name;
    private int age;

    @Autowired
    public void setName(String name) {
        this.name = name;
    }


    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        if(age==0)
            age=44;
    }
    @Configuration
    private static class Config{
        public Config() {
        }

        @Bean
        public String name(){
            return "Tarkan";
        }
    }

    @Override
    public String toString() {
        return "SingerWithInterface{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
