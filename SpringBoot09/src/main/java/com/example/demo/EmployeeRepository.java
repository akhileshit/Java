package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}



// THAT'S ALL!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

// This interface itself create some(actually many) methods automatically internally for making operations on the database! which if in jdbc/hibernate we have to define manually like CRUD operations and many more.
// U can use all those methods using just the 'reference' of this interface in any other classes (preferebly service class)
// NO BullShits