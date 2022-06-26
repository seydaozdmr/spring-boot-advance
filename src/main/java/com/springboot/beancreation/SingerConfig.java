package com.springboot.beancreation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class SingerConfig {
    @Bean(initMethod = "init")
    public SingerWithInitMethod singerWithInitMethod(){
        return new SingerWithInitMethod();
    }
}
