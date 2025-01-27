package collections13;

import java.util.Vector; // import

public class Demo { // Vector (LEGACY Class)
	
	public static void main(String[] args) {
		Vector v = new Vector();
		
		v.add(100);
		v.add(125.25);
		v.add("Hello Vector");
		v.add("Legacy");
		
		System.out.println(v);
		
		v.removeFirst();
		System.out.println(v);
		
		v.addFirst(400);
		System.out.println(v);
	}
}
