package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/employee/{id}")
	public Employee getEmployeeById(@PathVariable int id) { // use @PathVariable since its a variable within the request-string, and not a request param directly.
		return employeeService.findEmployeeById(id);
	}
	
	@GetMapping("/")
	@ResponseBody
	public String hello() {
		return "HEllo duda";
	}
}


// if u write just @Controller and add @RequestBody, we are getting json format