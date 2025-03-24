package multiThreading05;

public class Demo {

	public static void main(String[] args) { // Multi-Threading using single Class(single run()!!!). Crazy..
		
		// Same Class. 3 Different objects
		Demo1 d1 = new Demo1(); // A Thread got created
		Demo1 d2 = new Demo1(); // Another Thread got created
		Demo1 d3 = new Demo1(); // One more Thread got created
		
		// crucx
		d1.setName("type");
		d2.setName("multiply");
		d3.setName("search");
		
		d1.start();
		d2.start();
		d3.start();
	}
}

