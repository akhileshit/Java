package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.User;
import com.example.demo.repository.TokenRepository;
import com.example.demo.service.UserService;

@Controller
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	TokenRepository tokenRepository;
	
	@GetMapping("/")
	public String home() {
		return "login"; //returns login.html
	}
	
	@PostMapping("/login")
	public String login(@RequestParam("username") String username, 
							@RequestParam("password") String password, 
								Model model) {
		User user = userService.getUserByUsername(username);
		
		if (user != null && user.getPassword().equals(password)) {		
			userService.sendOtp(user);	
			model.addAttribute("username", username);
			return "verify-otp"; 
		}
		else {
			model.addAttribute("loginError", "Invalid credentials or user does not exist!");
			return "login";
		}
	}
	
	@PostMapping("/verify-otp")
	public String verifyOtp(@RequestParam("otp") String otp, Model model) {
		boolean verify = userService.verifyOtp(otp);
		
		if (verify == true) {
			model.addAttribute("message", "OTP verified successfully!");
			return "dashboard";
		}
		else {
			model.addAttribute("verifyError", "Invalid or expired otp.");
			return "verify-otp";
		}

	}
}
