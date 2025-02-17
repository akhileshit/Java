package collections30;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class Conclusion { // for creating comparison table for All Collection classes (Just to check)
	
	public static void main(String[] args) {

		LinkedHashSet ref = new LinkedHashSet();
		ref.add(50);
		ref.add(100);
		ref.add(50); // duplicate
		ref.add(null);
		ref.add(25);
		
		System.out.println(ref);
		
		
	}
	
}
