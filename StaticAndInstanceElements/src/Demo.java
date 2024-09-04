
public class Demo {
	// instance variable
	int a=100;
	
	// instance blocks
	{
		System.out.println("Instance block1 executed");
		a=500;
	}
	{
		System.out.println("Instance block2 executed");
		a=600;
	}
	
	// instance method
	void method() {
		System.out.println("Instance method executed");
		System.out.println("a=" + a);
	}
	
	// Static variable
	static int b=150;
	
	// static blocks
	static {
		System.out.println("Static block1 executed");
		b=250;
	}
	static {
		System.out.println("Static block2 executed");
		b=350;
	}
	
	// static method
	static void method2() {
		System.out.println("Static method executed");
		System.out.println("b=" + b);
	}
}
