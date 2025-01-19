
public class StudentApp {

	public static void main(String[] args) {
		Student s = new Student();
		s.setName(null);
		s.setAge(-22);
		s.setGender("Male");

		System.out.println("Student name: " + s.getName());
		System.out.println("Student age: " + s.getAge());
		System.out.println("Student gender: " + s.getGender());
		
		s.eat();
		s.sleep();
		s.study();
	}

}
