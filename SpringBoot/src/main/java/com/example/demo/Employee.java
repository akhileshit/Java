package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	@Autowired       //FIELD INJECTION                 (NOT RECOMMENDED they said)
	Organization organization;
	
	public void work() {
		System.out.println("EMPLOYEE IS WORKING IN " + organization.address);
	}
}
