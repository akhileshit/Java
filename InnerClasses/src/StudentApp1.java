
public class StudentApp1 { // Method 2
	public static void main(String[] args) {
		Student1 s1 = new Student1();
		s1.name = "Omkar";
		s1.age = 22;
		
		System.out.println(s1.name + " " + s1.age);
		
		System.out.println(s1.addr); 
		s1.addr.state = "Karnatakaaa"; // will work
		s1.addr.city = "Bengaluruuu"; // will work
		
		System.out.println(s1.addr.state + " " + s1.addr.city); 
	}
}
