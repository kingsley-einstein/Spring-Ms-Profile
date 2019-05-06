package com.spring.microservice.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringMsProfileApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMsProfileApplication.class, args);
	}

}
