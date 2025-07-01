package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)   //Optional
	int id;
	
	@Column
	String username;
	
	@Column
	String password;
	
	@Column
	String role;

//	public User() {
//		super();
//		// TODO Auto-generated constructor stub
//	}

//	public User(int id, String username, String password, String role) {
//		super();
//		this.id = id;
//		this.username = username;
//		this.password = password;
//		this.role = role;
//	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	
}
