package serialAndDeserial01;

import java.io.Serializable;

public class Student implements Serializable { // ----> implements Serializable mandatory

	String name;
	int age;
	String gender;
	int marks;
	
	public Student(String name, int age, String gender, int marks) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.marks = marks;
	}

	
	@Override
	public String toString() {
		return name + " " + age + " " + gender + " " + marks;
	}
}
// I know the use of serialVersionUID of serializable classes