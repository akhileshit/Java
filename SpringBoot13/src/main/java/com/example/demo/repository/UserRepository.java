package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	User findByUsername(String username); // Extra method we are telling springboot to please create along with other implicitly created methods
}


// IT'S NOT findUserByName/getByUsername/...   IT SHOULD BE "findByUsername"