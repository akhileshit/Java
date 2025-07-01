package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
	
	@GetMapping("/admin")
	String display() {
		return "This is Admin page";
	}
	
	@GetMapping("/pub")
	String display2() {
		return "Anybody can access!"; 
	}
}


 