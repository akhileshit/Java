package collections06;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo { // Iterator
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(100);
		al.add(50);
		al.add(150);
		al.add(25);
		al.add(75);
		al.add(125);
		al.add(175);
		
		
		
		System.out.println(al); // meth1
		
		System.out.println("TRAVERSING USING ENHANCED FOR LOOP");
		for (Object x : al) { // meth2
			System.out.print(x + " ");
		}
		System.out.println();
		
		System.out.println("TRAVERSING USING ITERATOR");
		Iterator itr = al.iterator(); 
		while (itr.hasNext() == true) { // meth3
			System.out.print(itr.next() + " ");
		}
	}
}
