package collections12;

public class Address {
	int streetNo;
	String streetName;
	
	public Address(int streetNo, String streetName) {
		super();
		this.streetNo = streetNo;
		this.streetName = streetName;
	}
	
	@Override
	public String toString() { 
		
		return streetNo + " " + streetName;
	}
}
