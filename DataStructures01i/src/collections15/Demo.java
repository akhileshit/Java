package collections15;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Demo { // ArrayDeque
	
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>(); // Using LinkedList
			//or
		ArrayDeque<Integer> dq = new ArrayDeque<>(); // Using ArrayDeque
		
		dq.add(10);
		dq.add(50);
		dq.add(25);
		dq.add(14);
		dq.add(15);
		
		System.out.println(dq);
		
		dq.removeFirst();
		System.out.println(dq);
		
		dq.removeLast();
		System.out.println(dq);
		
		dq.addFirst(80);
		System.out.println(dq);
		dq.removeFirst();
		
		// dq.add(1, 55); // Method Not present only
	 
		
		
	}
}
