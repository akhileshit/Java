package collections23__;

public class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public Person() {
		
	}
	
	@Override
	public String toString() {
		
		return name + "  " + age;
	}
	
	//Let's say Forgot to Implement Comparable interface and Override compareTo() method
}
