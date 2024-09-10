
public class StudentApp { // Counting # Objects created using Instance block

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		System.out.println("# Objects created for Student class is " + Student.count);
		
		new Student();
		new Student();
		new Student();
		System.out.println("# Objects created for Student class is " + Student.count);
	}

}
