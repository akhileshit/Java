package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary   // Since Unix class also implements OS, Windows is made Primary (which we want to be), removes ambiguity.  This 'can' be overidden by @Qualifier(bean_name)!!!
public class Windows implements OS {

	@Override
	public void operate() {
		System.out.println("Windows OS is Operating..");
		
	}
}

// @Qualifier also gets the job done. [Assignment]

