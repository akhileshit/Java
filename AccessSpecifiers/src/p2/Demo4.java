package p2;   // Access Specifiers public, protected, default and private

import p1.Demo1;

public class Demo4 { // package 2
	void display4() {
		Demo1 d1 = new Demo1();
		System.out.println(d1.a);
		//System.out.println(d1.b); // Not visible
		//System.out.println(d1.c); // Not visible 
		//System.out.println(d1.d); // Not visible
	}
}
