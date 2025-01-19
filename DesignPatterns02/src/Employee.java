
public class Employee {
	private static Employee e = null; // 1st step
	
	String name;
	int age;
	String gender;
	int salary;
	int dependents;
	String type;
	
	private Employee(String name, int age, String gender, int salary, int dependents, String type) { // 2nd step
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.dependents = dependents;
		this.type = type;
	}

	void work() {
		System.out.println(name + " " + type + " is working..");
	}
	
	void applyLeave() {
		System.out.println(name + " " + type + " applied for leave");
	}
	
	public static Employee getInstance() { // 3rd step
		if (e == null)
			e = new Employee("Omkar", 22, "Male", 50000, 2, "Fulltime");
		return e;
	}
}
