package com.example.demo;

public class Laptop {
	
	OS os;
	
	public void setOs(OS osys) {  //Setter   "But the catch here is if you give any other name for setter(other than "setos" it won't work!!"(becaz that's how springFramework is modeled!!!. we hv to follow the rules)
		this.os = osys;
	}
	
	public void build() {
		os.operate();
		System.out.println("LAPTOP IS BUILDING AN AMAZING APP..");
	}
}
