
public interface Demo3 { // private method in interface
	
	private static void display() { // private method possible
		System.out.println("You are accessing private method inside an interface");
	}
	
	static void display2() { // other method inside interface
		display();
	}
	
	default void display3() { // other method inside interface
		display();
	}

	abstract void display4() ; 
	
}

// Observe no abstract methods are written inside interface!!!
// display() can also be made non-static with private, but cannot be accessed by static method inside interface
// Now if u want to access private method inside interface in implementing classes, access USING static and default methods which are inside interface itself.