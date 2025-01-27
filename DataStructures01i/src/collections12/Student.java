package collections12;

public class Student<t> { // Solution - GEnerics
	t address;
	
	public Student(t address) {
		
		this.address = address;
	}
	
	public void printAddress() {
		// Now i want to access the streetNo of Address (Where is streetNo(Only)?????)
		System.out.println(address); 
		//System.out.println(((Address)address).streetNo); 
	}
	
	
}

// Actually we can do this even without Generics, by using Object type to 'address' and by overriding toString() in Address class
// So this is NOT the SOLUTION for the actual problem defined in the package collections11
// This you can think as Just the Intro to WildCards in Generics (Consider This Package as This)
// NO problems and NO solution