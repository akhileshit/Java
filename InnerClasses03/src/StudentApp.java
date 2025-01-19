
public class StudentApp { // Local Inner Class 

	public static void main(String[] args) {
		Student s = new Student();
		s.name = "Omkar";
		s.age = 22;
		
		System.out.println(s.name + " " + s.age);
		
		s.display(); // simply
	}

}
