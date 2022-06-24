package com.springboot.dersler.util;

import org.springframework.stereotype.Service;

@Service
public class VehicleService {
    private AracStart aracStart;

    public VehicleService(AracStart aracStart) {
        this.aracStart = aracStart;
    }

    public void startVehicle(){
        aracStart.rastgeleAracStart();
    }
}
