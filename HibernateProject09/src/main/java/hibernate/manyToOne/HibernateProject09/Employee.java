package hibernate.manyToOne.HibernateProject09;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Employee { //Many employees can be in One department
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  
	int id;
	
	@Column
	String name;
	
	@Column
	int salary;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "dept_id")  //name of the column in mysql(db) table. Even specifiying 'referencedColumnName' value here is a good practice.
	Department dept;

	public int getId() {
		return id;
	}

	public void setId(int id) { //not req
		this.id = id;
	}

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

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}
	
	
}
