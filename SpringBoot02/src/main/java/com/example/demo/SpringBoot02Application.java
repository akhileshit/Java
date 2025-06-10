
// 13/12/24
package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBoot02Application { // Interfaces Scenario in SpringBoot [@Primary]

	public static void main(String[] args) {
		// Get the Application Context
		ApplicationContext ac = SpringApplication.run(SpringBoot02Application.class, args);
		
		// Get the Laptop bean from springBoot
		Laptop lappy = (Laptop) ac.getBean("laptop");
		
		// Call the method from Laptop
		lappy.build();
	}

}


// SpringBoot02-04     13/12/24