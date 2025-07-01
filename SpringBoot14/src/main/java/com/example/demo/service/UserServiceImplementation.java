package com.example.demo.service;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Token;
import com.example.demo.entity.User;
import com.example.demo.repository.TokenRepository;
import com.example.demo.repository.UserRepository;

@Service
public class UserServiceImplementation implements UserService{
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	TokenRepository tokenRepository;
	
	@Autowired
	JavaMailSender mailSender;
	
	public User getUserByUsername(String username) {
		// TODO Auto-generated method stub
		return userRepository.findByUsername(username);
	}

	@Override
	public Token getTokenByOtp(String otp) {
		// TODO Auto-generated method stub
		return tokenRepository.findByOtp(otp);
	}

	@Override
	public boolean verifyOtp(String otp) {
		// TODO Auto-generated method stub
		Token token = getTokenByOtp(otp);
		if (token != null && ChronoUnit.MINUTES.between(token.getCreated_at(), LocalDateTime.now()) < 1) {
			tokenRepository.delete(token);
			return true;
		}
		return false;
	}

	@Override
	public void sendOtp(User user) {
		// TODO Auto-generated method stub
		//Generate OTP
		String otp = String.format("%06d", new Random().nextInt(999999));
		
		//Save otp as token
		Token token = new Token();
		token.setUser(user);
		token.setOtp(otp);
		token.setCreated_at(LocalDateTime.now());
		tokenRepository.save(token);
		
		//Send OTP via mail
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(user.getEmail());
		message.setSubject("Your OTP Code");
		message.setText("Use this code for otp: " + otp + ". This otp is valid only for 60 seconds.");
		mailSender.send(message);
		
	}
}
