
public class StudentApp { // Copy Constructors
	public static void main(String[] args) {
		Student s = new Student("Omkar", 22, 99);
		s.display();
		
		Student s1 = new Student(s); // Copying old data to new object by giving old object reference
		
		// now modify new object
		System.out.println("Showing Modified data:===================");
		s1.age = 24;
		s1.marks = 100;
		s1.display();
		
		// Access old data using s !!!!!!!!
		System.out.println("Showing Old Data:=========================");
		s.display();
	}
}
