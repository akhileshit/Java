package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBoot12Application { //Spring Security with Custom Configurations and security to only page u want

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot12Application.class, args);
	}

}

// Wrote one new Class for security configurations with security code
// No application.properties config wrote for security

// The login only asked for admin page