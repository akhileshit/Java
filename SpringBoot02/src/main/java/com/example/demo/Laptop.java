package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
	
	OS os;
	
	@Autowired   //Not needed actually      [constructor injection]
	public Laptop(OS os) { // Also in SpringBoot we no need to specify the implementation by upcasting.!!! SpringBoot takes care of it!![OMG]
		this.os = os;
	}
	
	void build() {
		os.operate();   //SpringBoot will smartly search for the implementation of OS and create&uses it's object.
		System.out.println("Laptop is building a Great App..");
	}
}


// But if there are multiple implementations, then we hv to specify which implementation we need springBoot to get, using @Primary, @Qualifier