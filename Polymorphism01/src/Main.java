 class Parent {
	void display() {
		System.out.println("Parent display");
	}
}

class Child1 extends Parent {
	void display() {
		System.out.println("Child1 display");
	}
}

 class Child2 extends Parent {
	void display() {
		System.out.println("Child2 display");
	}
}


class Child3 extends Parent {
	void display() {
		System.out.println("Child3 display");
	}
}


public class Main {

	public static void main(String[] args) {
		Parent ref;
		
		Child1 c1 = new Child1();
		Child2 c2 = new Child2();
		Child3 c3 = new Child3();
		
		ref = c1; // Up-casting
		ref.display(); // Same statement diff o/p
		ref = c2;
		ref.display(); // Same statement diff o/p
		ref = c3;
		ref.display(); // Same statement diff o/p

	}

}
