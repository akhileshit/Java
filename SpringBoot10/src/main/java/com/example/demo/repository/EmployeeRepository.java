package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	
}


// Generates many methods for almost all operations to the Employee Database internally
// ur work is to just make use of it by using its reference typically in service class.