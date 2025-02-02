package collections23__;

import comparable01akhil.Person; //

public class PersonX extends Person implements Comparable { // THis cannot be done if a class is declared 'final'
	
	int age; //
	String name; //
	
	public PersonX(String name, int age) {
		super(name,age);
		this.age = age; //
		this.name = name; //
	}
																// I tried this for myself
																// Why worry this much? Just use comparator
	@Override
	public int compareTo(Object o1) {
		if (this.age > ((PersonX)o1).age) {
			return 1;
		}
		else if(this.age == ((PersonX)o1).age) {
			return 0;
		}
		else {
			return -1;
		}
	}
	
}
