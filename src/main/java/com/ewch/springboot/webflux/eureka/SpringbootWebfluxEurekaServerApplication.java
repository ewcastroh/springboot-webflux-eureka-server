package com.ewch.springboot.webflux.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringbootWebfluxEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWebfluxEurekaServerApplication.class, args);
	}

}
