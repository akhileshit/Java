package collections17;

import java.util.TreeSet;

public class Demo { // TreeSet
	
	public static void main(String[] args) {
		
		TreeSet<Integer> ts = new TreeSet<>();
		
		ts.add(100); // Stores Data in the form of "Red-Black-Balanced Binary Search Tree"
		ts.add(50);
		ts.add(150);
		ts.add(25);
		ts.add(75);
		ts.add(125);
		ts.add(175);
		ts.add(175);
		//ts.add(null);
		ts.remove(100); 
		System.out.println(ts); // Sorted(In-Order-Traversal) ONly while Retrieving
		
		System.out.println("TS-----> " + ts);
		System.out.println(ts.ceiling(75));
		System.out.println(ts.ceiling(74));
		System.out.println(ts.higher(74));
		System.out.println(ts.higher(75));
		System.out.println("=====================");
		System.out.println(ts.floor(75));
		System.out.println(ts.floor(74));
		System.out.println(ts.lower(74));
		System.out.println(ts.lower(75));
		System.out.println("=====================");
		System.out.println(ts.headSet(100));
		System.out.println(ts.tailSet(100));
		System.out.println(ts.subSet(50, 150));
		
		// Searching
		System.out.println(ts.contains(150));
		
		
	}
}
