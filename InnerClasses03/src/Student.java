
public class Student {
	String name;
	int age;
	
	// LOCAL INNER CLASS
	void display() {
		// LIC
		class Address {
			String state;
			String city;
			
			public Address(String state, String city) {
				this.state = state;
				this.city = city;
			}
		}
		
		Address addr = new Address("Karnataka", "Bengaluru");
		
		System.out.println(addr.state + " " + addr.city);
	}
}
