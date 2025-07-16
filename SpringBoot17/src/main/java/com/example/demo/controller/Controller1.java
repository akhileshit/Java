package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.MyUserDetailService;

@RestController
public class Controller1 {
	
	@Autowired
	private MyUserDetailService service;
	
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to this page";
	}
	
	@PostMapping("/users")
	public List<User> getAllUsers() {
		return service.findAllUsers();
	}
}
