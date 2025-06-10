package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBoot03Application { // A Simple Web Application using Spring Boot!

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot03Application.class, args);
	}

}

// This class not needed, Since everything is taken care by the "Server" and its web-container!!
// Just run this project as "Spring boot app"
// Along with this don't forget to change the port of the tomcat server(created and configured by springBoot itself) if any app like oracle is using the default port 8080. Change port in application.properties file
// But 1st u hv to select spring web dependency to get the server ready!!.