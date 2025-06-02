//11/12/24
package com.demo.SpringFramework;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication   since this is not a sprinboot app but spring
public class SpringFrameworkApplication {  // Spring Framework App     (Showing Constructor Injection)

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml"); //telling spring the path where the Objects that a programmer wnats to create are specified!
		Laptop laptop = (Laptop) ac.getBean("lap");  // "lap" is the 'id' of the bean (of which the object shd be created by the spring)
		laptop.build();
	}
	
}


//11/12/24
// This is the project file created using spring.io initializer. (specified, downloaded & imported(it's in the download folder) here i copied that project folder to eclipseworkspace1 from downloads and imported it. but u can also see another workspace(in D:/) (same project) importing project directly from downloads folder [project file v.similar to maven project]. This is a Spring Boot project template. NOt just Spring
// created .xml file to tell spring it's configurations! ["ApplicationContext"]. (conventional names: spring-config, application-context.xml,..)
// we are told that the application context is the one which tells springs to what objects to create(by itself & not by programmers!).

// Go to STS "SpringFramework" [the next project file created. just shown the other way]
// but some coding done here only & not in STS project(just an empty project)

//Bean => Nothing but the class!!   (The Class whose object will be created by the spring are conventionally called beans!!!)
//created one xml by ourselves "spring-config.xml" [The heart of Spring Projects. Not SpringBoot projects!]
// The core idea here is to make spring manage the objects rather than programmer => Inversion Of Control(IOC)

//Dependency Injection: (3-types) they told
//- Construction injection
//- Field injection
//- Setter injection

//NOTE: Dependency means not only jar files & libraries required for maven/Spring projects. DEpendency here means one class depending on another


//Inversion of Control(IOC) :    "Idea" of giving control to someone(Spring)
//Dependency Injection(DI)  :    "Implementation" of IOC 



//end
