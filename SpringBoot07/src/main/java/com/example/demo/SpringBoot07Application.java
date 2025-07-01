
// 18/12/24
package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBoot07Application {  // A Simple Calculator Web App with Controller, Service and Thymeleaf

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot07Application.class, args);
	}

}

// This was the claculator assignment of the previous class


//18/12
// Taught about REST (Representational State TRansfer Protocol)
// It's  a protocol/Idea and an architectural style for web communication, which seperates client & server.
// It's stateless, hence all the transactions are independent , hence shd contains all the info.
// Uses http methods like GET, POST, DELETE.. 
// Status codes like 200, 201, 400, 404, 500
// Structure of handlling data using REST protocol:
//	- Controller       to mediate b/w service and repository, to define mappings(handle requests)
//	- Service		to write the logics/operations 
//	- Repository		to write database logics (can wirte jdbc or hibernate or use 'spring boot's potential')

// Finally they provide api's (nothing but different mappings!! like /result, /employee/5..) to use
// REST outputs the data fetched in JSON format