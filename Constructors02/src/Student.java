
public class Student { // Slightly modified Constructors01
	int id;
	String name;
	
	Student(int a, String b) {
		id = a;
		name = b;
	}
	
	void study() {
		System.out.println("Student " + name + " with id " + id + " is Studying");
	}
	
}
