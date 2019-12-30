package com.forezp.eurekaclientadmin;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableEurekaClient
@EnableAdminServer
@EnableHystrix
@EnableHystrixDashboard
@EnableTurbine
public class EurekaClientAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientAdminApplication.class, args);
	}
}
