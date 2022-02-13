package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * this app uses rest api to send registration infos to SpringRestMicroServiceForRegister
 * 
 * 
 * */

@SpringBootApplication
public class SpringRestMicroServicesDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestMicroServicesDemoApplication.class, args);
	}

}
