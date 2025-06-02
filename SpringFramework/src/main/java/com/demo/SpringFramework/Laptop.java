package com.demo.SpringFramework;

public class Laptop {
	
	OS os;
	
	public Laptop(OS os) {  
		this.os = os;
	}

	public void build() {
		os.operate();
		System.out.println("LAPTOP IS BUILDING AMAZING APP...");
		
	}

}
