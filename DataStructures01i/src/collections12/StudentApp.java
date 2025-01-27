package collections12;

public class StudentApp { // Solution - Generics
	
	public static void main(String[] args) {
		
		Student<Address> stu = new Student<Address>(new Address(1,"BTM"));
		stu.printAddress();
		
		Student<String> stu1 = new Student<String>("Vijaynagar"); 
		stu1.printAddress(); 
		
		Student<Integer> stu2 = new Student<Integer>(25); 
		stu2.printAddress(); 
	}
}
