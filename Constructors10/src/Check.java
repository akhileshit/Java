
public class Check {

	int a=100;
	int b=200;
	
	void  forThisKey() {
		//super(); (or) this();   not possible
		this.a = 400;
		System.out.println(this.a);
		
	}
	
	
	public Check() {
		//this(); Recursive invoke not possible
		this(10);
		//this(10,20); not possible after 1 this() above
		System.out.println("I am the ZP constructor");
	}
	
	public Check(int a) {
		//super(); or this();
		System.out.println("I am the 1P constructor");
	}
	
	public Check(int a, int b) {
		//super(); or this();
		System.out.println("I am the 2P constructor");
	}
	

}
