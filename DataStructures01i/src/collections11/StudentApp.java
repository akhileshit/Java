package collections11;

public class StudentApp { // Problem
	
	public static void main(String[] args) {
		
		Student stu = new Student(new Address(1,"BTM"));
		stu.printAddress();
		
		Student stu1 = new Student("Vijaynagar"); 
		stu1.printAddress(); // ClassCastEXCEPTION Obviously because of HardCoding to 'Address' type
	}
}
