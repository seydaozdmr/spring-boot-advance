package com.springboot.dersler;

import com.springboot.dersler.util.VehicleService;
import com.springboot.dersler.vehicle.Arac;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DerslerApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DerslerApplication.class, args);
//		Arac arac=(Arac) ctx.getBean("getArac");
//		arac.start();
		VehicleService vehicleService= (VehicleService) ctx.getBean("vehicleService");
		vehicleService.startVehicle();
	}

}
