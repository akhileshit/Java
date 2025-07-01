package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService service;   //Automatically finds a class implementing this and creates its object for us.
	
	@GetMapping("/poststudent")
	public Student createStudent(@RequestBody Student student) {
		return service.createStudent(student);
	}
	
	@GetMapping("/student/{id}")
	public Student fetchStudentById(@PathVariable int id) {
		return service.fetchStudentById(id);
	}
	
	@GetMapping("/students")
	public List<Student> fetchAllStudents() {
		return service.fetchAllStudents();
	}

	@PutMapping("/updatestu")
	public Student updateStudent(@RequestBody Student student) {
		return service.updateStudent(student);
	}

	@DeleteMapping("/deletestu/{id}")
	public String deleteStudent(@PathVariable int id) {
		return service.deleteStudent(id);
	}
}
