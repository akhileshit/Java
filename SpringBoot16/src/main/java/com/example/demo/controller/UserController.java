package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.jwt.security.JwtUtil;
import com.example.demo.repository.UserRepository;


@RestController
@RequestMapping("/api/auth")
public class UserController {
	
	@Autowired
	AuthenticationManager authenticationManager;
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	PasswordEncoder encoder;
	
	@Autowired
	JwtUtil jwtUtils;
	
	@PostMapping("/signin")
	public String authenticateUser(@RequestBody User user) {
		try {
		Authentication authentication = authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(
						user.getUsername(), 
						user.getPassword()
						)
				);
		UserDetails userDetails = (UserDetails) authentication.getPrincipal();
		return jwtUtils.generateToken(userDetails.getUsername());
		
		} catch (StackOverflowError e) {
			System.out.println("Yes StackOverFlow occurred..." + e);
		}
		return "Yes Some Exception occurred..";
	}
	
	@PostMapping("/signup")
	public String registerUser(@RequestBody User user) {
		if (userRepository.existsByUsername(user.getUsername())) {
			return "Error: Username is already taken!";
		}
		// Create new user's account
		User newUser = new User(user.getUsername(), encoder.encode(user.getPassword()));
		userRepository.save(newUser);
		return "User registered successfully!";
		
	}
}
