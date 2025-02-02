package collections20;

import java.util.LinkedHashSet;

public class Demo { // LinkedHashSet
	
	public static void main(String[] args) {
		
		LinkedHashSet lhs = new LinkedHashSet();
		
		lhs.add(100);
		lhs.add(50);
		lhs.add(150);
		lhs.add(25);
		lhs.add(75);
		lhs.add(125);
		lhs.add(175);
		lhs.add(null);
		System.out.println(lhs); // Printed in the Order which NO ONE CAN PREDICT
	}
}
