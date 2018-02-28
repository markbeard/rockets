package com.nbb.microservices.rockets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@EnableHystrixDashboard
@SpringBootApplication
public class RocketsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RocketsApplication.class, args);
	}
}
