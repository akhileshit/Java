package p1;   // Access Specifiers public, protected, default and private

public class Demo3 extends Demo1 { // package 1
	
	void display3() {
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		//System.out.println(d); // Not visible
	}
}
