
public class Student {
	private static Student s = null; //
	String name;
	int age;
	
	private Student(String name, int age) { // private constructor
		this.name = name;
		this.age = age;
	}
	
	void study() {
		System.out.println(name + " student is Studying");
	}
	
	public static Student getInstance() {
		if (s == null) {
			s = new Student("Omkar", 22);
		}
		return s;
	}
}
