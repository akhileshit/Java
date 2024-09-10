package p1;   // Access Specifiers public, protected, default and private

public class Demo2 { // package 1
	
	void display2() {
		Demo1 d1 = new Demo1();
		System.out.println(d1.a);
		System.out.println(d1.b);
		System.out.println(d1.c);
		//System.out.println(d1.d); // Not visible
	}
}
