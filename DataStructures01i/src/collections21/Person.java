package collections21;

import java.util.Objects;

public class Person { // A Person class with 3 overridden methods from Object class
	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		
		return name + "  " + age;
	}
	
	
	@Override
	public boolean equals(Object obj) {

		if (obj==null  ||  obj.getClass() != this.getClass()) {
			return false;
		}
		
		Person p = (Person) obj; // DownCasting
		if (this.name==p.name && this.age==p.age ) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	
	@Override
	public int hashCode() {
		
		return Objects.hash(name, age); // Produce the hash-values for name and age , when HashSet is used ,which makes use of hashCode() method
	}
	
	// equals() also is used by HashSet, so it is also mandatory along with hashCode()
}
