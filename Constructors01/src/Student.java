
public class Student {
	int id;
	String name;
	
	void study() {
		System.out.println("Student " + name + " with id " + id + " is Studying");
	}
	
	void setValues(int a, String b) {
		id = a;
		name = b;
	}
}
