package comparable01akhil;

public class Personkjsadlfkj { // This is what is written inside the Person class inside Referenced Libraries in comparable01akhil package
	String name;
	int age;
	
	public Personkjsadlfkj(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		
		return name + "  " + age;
	}
	
	//Forgot to Implement Comparable interface and Override compareTo() method
}
