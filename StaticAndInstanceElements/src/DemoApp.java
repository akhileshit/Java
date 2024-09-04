
public class DemoApp { // Elements which can be there directly inside a CLASS (i-var's, i-blocks, i-methods, s-var's, s-blocks, s-methods and consturctors)
	public static void main(String[] args) {
		Demo d = new Demo();
		d.method();
		Demo.method2();
		
		// Code showing variable-hiding concept
		Demo d1 = new Demo1(); // up-casting (no effect) (similar to static variables but still not class-level)
		System.out.println(d1.a); // variable-hiding
	}
}
