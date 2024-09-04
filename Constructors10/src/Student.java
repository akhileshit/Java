
public class Student {
	String name;
	int age;
	static int count = 0;
	
	public Student() {
		super(); // Good practice
		count++;
	}
}
