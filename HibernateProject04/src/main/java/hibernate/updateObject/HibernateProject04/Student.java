package hibernate.updateObject.HibernateProject04;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id
	private int id;
	@Column
	private String name;
	@Column
	private int age;
	@Column
	private int marks;
	@Column
	private String email;
	@Column
	private int phone;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ID: " + id + "\nNAME: " + name + "\nAGE: " + age + "\nMARKS: " + marks + "\nEMAIL: " + email + "\nPHONE: " + phone;
	}
	
}
