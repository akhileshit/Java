package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

import java.util.Collections;

@Service
public class UserServiceImplementation implements UserDetailsService {

	@Autowired
	 UserRepository userRepository;


	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
				User user = userRepository.findByUsername(username);
				if (user == null) {
					throw new UsernameNotFoundException("User not found with username: " + username);
				}
				return new org.springframework.security.core.userdetails.User(
						user.getUsername(),
						user.getPassword(),
						Collections.emptyList()
				);
	}

}
