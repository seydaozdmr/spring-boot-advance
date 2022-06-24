package com.springboot.dersler.util;

import com.springboot.dersler.vehicle.Arac;
import com.springboot.dersler.vehicle.Bmw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AracStart {
    private Arac arac;

    //constructor injection
//    public AracStart(@Qualifier("audi")Arac arac) {
//        this.arac = arac;
//    }
    @Autowired
    @Qualifier("bmw")
    public void setArac(Arac arac){
        this.arac=arac;
    }

    public void rastgeleAracStart(){
        arac.start();
    }
}
