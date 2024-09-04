
public class Demo1 extends Demo {
	int x;
	int y;
	
	public Demo1() {
		super(); // Good Practice
		x = 100;
		y = 200;
	}
	
	public Demo1(int x) {
		super(); // Good Practice
		this.x = x;
	}
	
	public Demo1(int x, int y) {
		super(1000, 2000, "Omkar"); 
		this.x = x;
		this.y = y;
	}
	
	public void display2() {
		System.out.println(a + " " + b + " " + c);
		System.out.println(x + " " + y);
	}
}
