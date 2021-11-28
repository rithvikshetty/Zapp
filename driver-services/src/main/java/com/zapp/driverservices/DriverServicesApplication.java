package com.zapp.driverservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.zapp"})
public class DriverServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DriverServicesApplication.class, args);
	}

}
