package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication   // REquired
public class Application {

	public static void main(String[] args) { //Spring Boot 
		ApplicationContext ac = SpringApplication.run(Application.class, args); //No need of application-context xml
		
		Student student = (Student) ac.getBean("student"); //we haven't wrote any xml for specifying beans right? by default springBoot creates the bean named class_name(lowercase)!!. Again, its a framework and we have to follow the rules. but its intuitive.
		student.study();
		System.out.println("==================");
		
		Employee employee = (Employee) ac.getBean("employee");
		employee.work();
		
	}

}


//@Component annotation mandatory for springBoot to create any class's object
//@SpringBootApplication req since no xml files written
//@Autowired necessary for setter & field injection