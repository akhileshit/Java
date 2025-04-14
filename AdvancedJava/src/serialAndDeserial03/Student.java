package serialAndDeserial03;

import java.io.Serializable;

public class Student implements Serializable { // ----> implements Serializable mandatory

	String name;
	int age;
	String gender;
	int marks;
	// password will not be stored in file during serialization
	transient String password; // made transient  (Selective serialization) 
	
	public Student(String name, int age, String gender, int marks, String password) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.marks = marks;
		this.password = password;
	}

	
	@Override
	public String toString() {
		return name + " " + age + " " + gender + " " + marks + " " + password;
	}
}
