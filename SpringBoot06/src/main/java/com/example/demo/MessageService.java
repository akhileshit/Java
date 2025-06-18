package com.example.demo;

import org.springframework.stereotype.Service;

@Service         //Even @Component is working (this is what we were annotating earlier)
public class MessageService {
	
	public String buildMessage(String name) {
		return "Hello " + name + ", Welcome to KODNEST";
	}
}


//THis class is written for seperation of concerns, where controller acts just as a server(servlet), service acts as a chef
// Spring boot will component-scan wheather it is Controller/ Service/ Component  (Keep in mind)