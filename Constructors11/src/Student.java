
public class Student {
	String name;
	int age;
	int marks;
	
	public Student(String name, int age, int marks) {
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	
	public Student(Student ref) { // COPY CONSTRUCTOR
		this.name = ref.name;
		this.age = ref.age;
		this.marks = ref.marks;
	}
	
	void display() {
		System.out.println(name + " " + age + " " + marks);
	}
}
