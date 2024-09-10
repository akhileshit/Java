
public class Demo3 extends Demo2 {
	// Cannot change the return type while overriding
//	int greet() {
//		
//	}
	
	Demo1 display() { // Co-varient return type (possible)
		System.out.println("Hello World");
		return new Demo1();
	}
	
	// Error: Cannot reduce the visibility of the inherited method from Demo2
//	void show() {
//		System.out.println("Hi....");
//	}
	
}
