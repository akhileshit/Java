package collections07;

import java.util.Iterator;
import java.util.LinkedList;

public class Demo { // Iterator
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		
		ll.add(100);
		ll.add(true);
		ll.add('n');
		ll.add(25);
		ll.add(2.52);
		ll.add(125);
		ll.add("Hey");
		
		System.out.println(ll); // meth1
		
		System.out.println("TRAVERSING USING ENHANCED FOR LOOP");
		for (Object x : ll) { // meth2
			System.out.print(x + " ");
		}
		System.out.println();
		
		System.out.println("TRAVERSING USING ITERATOR");
		Iterator itr = ll.iterator(); 
		while (itr.hasNext() == true) { // meth3
			System.out.print(itr.next() + " ");
		}
		System.out.println();
		
		System.out.println("TRAVERSING USING FOR LOOP");
		for (int i=0; i<ll.size() ; i++) {
			System.out.print(ll.get(i) + " "); 
		}
	}
}
