package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBoot17Application { // My Security Experiment-1

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot17Application.class, args);
	}

}


/* Using: 
 * 		UserDetailsService, UserDetails, User (In-Built)
 * 		and by custom configuring SecurityFilterChain, AuthenticationProvider
 * 
 * 
 * */

