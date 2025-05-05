package hibernate.ems.HibernateProject05Assig;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	//Fields
	@Id
	private int id;
	@Column
	private String name;
	@Column
	private int salary;
	@Column
	private long phone;
	@Column
	private String email;
	@Column
	private String type;
	
	//Constructors
	public Employee(int id, String name, int salary, long phone, String email, String type) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.phone = phone;
		this.email = email;
		this.type = type;
	}
	public Employee() { //Mandatory. To get records
		
	}

	//Getters & Setters  //Mandatory. To update records
	public String getName() { 
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	//toString()
	@Override
	public String toString() {
		return "ID: " + id + "\nNAME: " + name + "\nSALARY: " + salary + "\nPHONE: " + phone + "\nEMAIL: " + email + "\nTYPE: " + type;
	}
}
