
public class StudentApp { // Static Inner Class 

	public static void main(String[] args) {
		Student s = new Student();
		s.name = "Omkar";
		s.age = 22;
		
		System.out.println(s.name + " " + s.age);
		
		Student.Address ad = new Student.Address(); // Changed
		System.out.println(ad); 
		ad.state = "Karnataka"; 
		ad.city = "Bengaluruuu"; 
		
		System.out.println(ad.state + " " + ad.city); 

	}

}
