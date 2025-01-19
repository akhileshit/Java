
public class StudentApp { // Method 1
	public static void main(String[] args) {
		Student s = new Student();
		s.name = "Omkar";
		s.age = 22;
		
		System.out.println(s.name + " " + s.age);
		 
//		Address ad = new Address();
//		s.addr = ad;
		System.out.println(s.addr); // null
		s.addr.state = "Karnataka"; // NOT work
		s.addr.city = "Bengaluru"; // NOT work
		
		System.out.println(s.addr.state + " " + s.addr.city); // Not work
	}
}
