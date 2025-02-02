package collections19;

import java.util.HashSet;

public class Demo { // HashSet
	
	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		
		hs.add(100);
		hs.add(50);
		hs.add(150);
		hs.add(25);
		hs.add(75);
		hs.add(125);
		hs.add(175);
		hs.add(null);
		System.out.println(hs); // Printed in the Order which NO ONE CAN PREDICT
	}
}
