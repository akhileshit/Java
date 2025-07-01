
//23/12/24
package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBoot11Application { // Spring Security to all pages

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot11Application.class, args);
	}

}

//Dependencies:
//	-Spring Web
//	-Spring Security

// The login UI will be given by spring itself if you just add the dependency!!!
// But this applies the username & password to all the pages