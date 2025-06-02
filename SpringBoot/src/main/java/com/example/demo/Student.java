package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	Address ad;
	
////	@Autowired    //autowire not needed, since object creation triggers it
//	public Student(Address ad) {
//		this.ad = ad;
//	}
	
	@Autowired     //SETTER INJECTION
	public void setAd(Address ad) {  // This method will be automatically called by the springBoot!!!!!!! (OMG) Maybe by seeing the 'ad.' ref variable inside sutdy(), it will search for setter for ad(setAd)+ autowired annotation and runs it
		this.ad = ad;
	}
	
	public void study() {
		ad.printAddress();
		System.out.println("Student is Studying..");
	}
}


//No xml files, No extra unreadable code, Nothing..  Only Annotations are under work in "SpringBoot"
