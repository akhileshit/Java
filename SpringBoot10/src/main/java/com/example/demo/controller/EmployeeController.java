package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/emp")   // For every mapping prefixing this is madatory if wirtten
public class EmployeeController {
	
	@Autowired
	EmployeeService service;   // also autodetects the implemented class [This is the interface scenario]
	
	@PostMapping("/postemp")     //PostMapping for creating
	public Employee createEmployee(@RequestBody Employee employee) {  //Get the employee object from the request "body" [json]
		return service.createEmployee(employee);
	}
	
	@GetMapping("/employees")
	public List<Employee> fetchAllEmployees() {
		return service.fetchAllEmployees();
	}
	
	@GetMapping("/employee/{id}")
	public Employee fetchEmployeeById(@PathVariable int id) {
		return service.fetchEmployeeById(id);
	}
	
	@PutMapping("/updateemp")    //PutMapping for update [can also write GetMapping,RequestMapping...!!] It's just a formalities
	public Employee updateEmployee(@RequestBody Employee employee) {
		return service.updateEmployee(employee);
	}
	
	@DeleteMapping("/deleteemp/{id}")        //DeleteMapping for delete
	public String deleteEmployee(@PathVariable int id) {
		return service.deleteEmployee(id);
	}
}
									
