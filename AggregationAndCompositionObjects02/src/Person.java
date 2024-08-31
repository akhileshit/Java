
public class Person extends Human {
	int id = 1;
	String name = "Akhilesh";
	String gender = "Male";
	
	void eat() {
		System.out.println("Person is eating..");
	}
	void walk() {
		System.out.println("Person is walking..");
	}
	
	Heart hr = new Heart(); // Composite object
	Brain br = new Brain(); // Composite object
	
}
