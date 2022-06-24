package com.springboot.dersler.util;

import com.springboot.dersler.vehicle.Audi;

public class AudiStart {
    private Audi audi ;

    public AudiStart() {
        this.audi = new Audi();
    }

    public void start(){
        audi.start();
    }


}
