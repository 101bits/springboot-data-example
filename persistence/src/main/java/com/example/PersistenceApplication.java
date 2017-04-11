package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// learn about this annotation in https://spring.io/guides/gs/spring-boot/
@SpringBootApplication
public class PersistenceApplication {
	public static void main(String[] args) {
		SpringApplication.run(PersistenceApplication.class, args);
	}
}
