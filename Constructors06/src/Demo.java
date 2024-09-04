
public class Demo {
	int a;
	int b;
	String c;
	
	public Demo() {
		super(); // Good practice
		a =10;
		b =20;
		c = "Omkar";
	}
	
	public Demo(int a) {
		super(); // Good practice
		this.a = a;
	}
	
	public Demo(int a, int b) {
		super(); // Good practice
		this.a = a;
		this.b = b;
	}
	
	public Demo(int a, int b, String c) {
		this(); // Here is the this() method--------------------------------------------------
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public void display1() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
