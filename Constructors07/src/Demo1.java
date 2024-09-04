
public class Demo1 extends Demo {
	int x;
	int y;
	
	public Demo1() {
		super(); // Good Practice
		x = 100;
		y = 200;
	}
	
	public Demo1(int x) {
		this(); 
		this.x = x;
	}
	
	public Demo1(int x, int y) {
		this(999); 
		this.x = x;
		this.y = y;
	}
	
	public void display2() {
		System.out.println(a + " " + b + " " + c);
		System.out.println(x + " " + y);
	}
	
	// DEFAULT CONSTRUCTOR WILL BE ADDED BY THE COMPILER
}
