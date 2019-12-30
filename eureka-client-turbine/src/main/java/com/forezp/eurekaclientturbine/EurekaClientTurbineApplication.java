package com.forezp.eurekaclientturbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableTurbine
@EnableEurekaClient
public class EurekaClientTurbineApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientTurbineApplication.class, args);
	}
}
