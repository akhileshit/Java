package collections21;

import java.util.HashSet;

public class Demo { // hashCode() Overriding concept
	
	public static void main(String[] args) {
		
		HashSet<Person> hs = new HashSet<>();
		
		hs.add(new Person("Satya",23));
		hs.add(new Person("Nayana",24));
		hs.add(new Person("Arun",23));
		hs.add(new Person("Nayana",24)); //Duplicate, But printing!!. Becaz of diff hash values for diff objects. So Override "Object" class's hashCode() method in "Person". STATUS: Handled
		hs.add(new Person("Varun",25));
		
		System.out.println(hs);
	}
}
// Hash values of objects(addresses) is computed here by Default.
// Hence Override hashCode() method and tell what shd be considered for hashing
// Obviously different objects will have different hash-values, irrespective of their contents inside.
// BOTH needed equals() and hashCode().