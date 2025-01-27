package collections11;

public class Student { // Problem
	Object address;
	
	public Student(Object address) {
		
		this.address = address;
	}
	
	public void printAddress() {
		// Now i want to access the streetNo of Address
		System.out.println(((Address)address).streetNo); // But this is like HardCoding (Not At All Right)
	}
	
	
}

// Solution in package collections12