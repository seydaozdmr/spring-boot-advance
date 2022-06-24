package com.springboot.base.injecting;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

@Service
public class CollectionInjection {
    @Resource(name = "map")
    private Map<String,Integer> map;


    public static void main(String[] args) {
        ApplicationContext ctx=new AnnotationConfigApplicationContext(CollectionInjection.class);

        CollectionInjection collectionInjection=(CollectionInjection) ctx.getBean("collectionInjection");

        collectionInjection.displayInfo();

    }

    public void displayInfo(){
        for(Map.Entry e:map.entrySet()){
            System.out.println(e.getKey() +" : "+e.getValue());
        }
    }

    @Configuration
    private static class Config{
        public Config(){

        }
        @Bean
        public Map<String,Integer> map(){
            Map<String,Integer> result=new HashMap<>();
            result.put("seyda",1);
            return result;
        }
    }
}
