package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SendController {
	
	@RequestMapping("/getpage")
	public String sendPage() {
		return "welcome";
	}
}

// Now here we haven't mentioned @RequestBody, it will get search for the page named "welcome"
// To get html page or dynamic html we need "thymeleaf" library!! for Spring Boot
// And should keep in templates folder
// And also as usual need Spring boot web library
// Anyway we selected these libraries during creating the project itself (STS)
// Change the tomcat port in application.properties