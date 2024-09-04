
public class Demo {
	int a;
	int b;
	String c;
	
	public Demo() {
		this(99, 9999);
		a =10;
		b =20;
		c = "Omkar";
	}
	
	public Demo(int a) {
		
		this.a = a;
	}
	
	public Demo(int a, int b) {
		this(9, 9999, "Prahllad");
		this.a = a;
		this.b = b;
	}
	
	public Demo(int a, int b, String c) {
		this(399); 
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
