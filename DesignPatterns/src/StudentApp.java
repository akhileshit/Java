
public class StudentApp { // Singleton Design Pattern
	
	public static void main(String[] args) {
		//Student s1 = new Student("Omkar", 22);
		Student s1 = Student.getInstance(); // one object gets created since s=null
		System.out.println(s1);
		s1.study();
		
		Student s2 = Student.getInstance(); // same object address is assigned since s!=null
		System.out.println(s2);
		s2.study();
		
//		Student s3 = s2;
//		System.out.println(s3);
//		s3.study();
		
	}
}
