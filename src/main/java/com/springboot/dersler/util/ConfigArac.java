package com.springboot.dersler.util;

import com.springboot.dersler.vehicle.Arac;
import com.springboot.dersler.vehicle.Audi;
import com.springboot.dersler.vehicle.Bmw;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ConfigArac {


    @Bean(name = "audi") //ejb enterprise java bean
    public Arac getAudi(){
        return new Audi();
    }
    @Bean(name = "bmw")
    public Arac getBmw(){
        return new Bmw();
    }


}
