package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Unix implements OS {

	@Override
	public void operate() {
		System.out.println("Unix OS is Operating..");
		
	}
	
	
}
