package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Greet {
	
	@RequestMapping("/")  // To map the request coming to / to this method
	@ResponseBody   // To as-it-is send the content returned by this method as a response body, instead of searching for the page named "HELLO USER WELCOME TO THE FIRST SPRING WEB PROJECT"!!!!!!!
	public String welcome() {
		return "HELLO USER WELCOME TO THE FIRST SPRING WEB PROJECT";
	}
	
	@RequestMapping("/greet")
	@ResponseBody
	public String orgName() {
		return "WELCOME TO KODNEST TECHNOLOGIES";
	}
	
	@RequestMapping("/bye")
	@ResponseBody
	public String thanks() {
		return "ALVIDAH....";
	}
}


// This is also a Controller
