
//12/12/24

package com.example.demo;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class SpringFramework01Application { //Spring Framework App Showing Setter Injection

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
		Laptop laptop = (Laptop) ac.getBean("lap"); 
		laptop.build();
	
	}
		
}

// xml is the heart of Spring (that we write)




// 12/12: SpringF..01, SpringBoot