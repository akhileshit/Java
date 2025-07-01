package com.example.demo.service;

import com.example.demo.entity.Token;
import com.example.demo.entity.User;

public interface UserService {
	
	User getUserByUsername(String name);
	
	Token getTokenByOtp(String otp);
	
	boolean verifyOtp(String otp);
	
	void sendOtp(User user);
}
