
public class Demo1 {
	int x;
	int y;
	String z;
	
	public Demo1(int a, int b, String c) {
		super(); // Good practice to write this (or else compiler will only write it internally)
		x=a;
		y=b;
		z=c;
	}
	
	void display() {
		System.out.println("DEMO1 INSTANCE VARIABLES " + x + " " + y + " " + z);
	}
}
