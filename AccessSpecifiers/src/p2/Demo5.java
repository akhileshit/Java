package p2;   // Access Specifiers public, protected, default and private

import p1.Demo1;

public class Demo5 extends Demo1 { // package 2
	void display5() {
		
		System.out.println(a);
		System.out.println(b);
		//System.out.println(c); // Not visible
		//System.out.println(d); // Not visible
	}
	
}
