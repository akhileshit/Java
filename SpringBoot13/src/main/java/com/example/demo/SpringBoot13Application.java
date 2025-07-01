package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBoot13Application { // Role Based Access Control

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot13Application.class, args);
	}

}

// No Spring Security Dependency added!!
// Hence no login UI provided by spring
// No Security config code in application.properties
// No Security Configurations class
// Just use the postman or give credentials through request-string to validate here in this project

// Here we used database to store and validate the credentials
// Be careful while writing custom method name in repository