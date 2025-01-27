package collections09;

public class Employee {
	int id;
	String name;
	int salary;
	
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	// Overriding toString() present in parent ("Object")
	@Override
	public String toString() {
		return id + " " + name + " " + salary;
	}
	
}
