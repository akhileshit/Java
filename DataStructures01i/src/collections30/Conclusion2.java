package collections30;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class Conclusion2 { // Accessing Elements in all types (Comparison)
	
	public static void main(String[] args) {
		
		LinkedList ref = new LinkedList();
		ref.add(50);
		ref.add(100);
		ref.add(50); 
		ref.add(75);
		ref.add(25);
		
		System.out.println(ref);
		
		// Traditional for loop (can be used only on List based classes bcz of "index-based" access get(i)  ArrayList & LinkedList)
		for (int i=0; i<ref.size(); i++) {
			System.out.println(ref.get(i)); // u know it is index based access - get()
		}
		System.out.println("========================================");
		
		
		// "listIterator()" Only for "List" based class (ArrayList & LinkedList)
		ListIterator itr = ref.listIterator(); // Usually its normal behavior (Forward access)
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("========================================");
		
		ListIterator itr1 = ref.listIterator(ref.size()); // If you want reverse behavior specify size
		while (itr1.hasPrevious()) { // hasPrevious()
			System.out.println(itr1.previous());
		}
		System.out.println("========================================");

		
		// descendingIterator() works for all type classes (List, Queue & Set). But there is a catch (only 1 of the class in each!) i.e., LinkedList, ArrayDeque & TreeSet 
		Iterator itr2 = ref.descendingIterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next()); 
		}
	}
}
