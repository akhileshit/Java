package collections22;

public class Employee implements Comparable {
	String name;
	int age;
	
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + "  " + age;
	}

	@Override
	public int compareTo(Object o) {
		if (this.name.compareTo(((Employee)o).name)   > 0 ) { // String comparison
		//if (this.age > ((Employee)o).age) {               // int comparison
			return 1;
		}
		else {
			return -1;
		}
	}
	
	
}
