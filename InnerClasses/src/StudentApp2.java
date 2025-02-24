
public class StudentApp2 { // Inner Class or Nested Class

	public static void main(String[] args) {
		Student2 s2 = new Student2();
		s2.name = "Omkar";
		s2.age = 22;
		
		System.out.println(s2.name + " " + s2.age);
		
		Student2.Address2 ad = s2.new Address2();
		System.out.println(ad); 
		ad.state = "Karnatakaaa"; 
		ad.city = "Bengaluruuu"; 
		
		System.out.println(ad.state + " " + ad.city); 
	
	}

}
