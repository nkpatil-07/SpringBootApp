package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class MsCrudClientCreateApplication {

	public static void main(String[] args) 
	{
		SpringApplication.run(MsCrudClientCreateApplication.class, args);
		System.out.println("ccreate client 8082");
	}

}
