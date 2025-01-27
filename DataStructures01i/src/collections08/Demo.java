package collections08;

import java.util.LinkedList;

public class Demo { // Additional methods only in LinkedList
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(100);
		ll.add(50);
		ll.add(150);
		ll.add(75);
		ll.add(175);
		ll.add(500);
		
		System.out.println(ll);
		
		LinkedList ll2 = new LinkedList();
		ll2.add("Ramu");
		ll2.add("Rajesh");
		ll2.add("Rohan");
		
		
		System.out.println(ll2);
		
		ll.addAll(ll2);
		System.out.println(ll);
		ll.addAll(3, ll2);
		System.out.println(ll);
		
		ll.addFirst("Kodnest");
		System.out.println(ll);
		
		ll.addLast("Technologies");
		System.out.println(ll);
		
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		
		ll.offer("pvt"); // similar to add() but no exceptions
		ll.offerFirst("BEST");
		ll.offerLast("ltd");
		System.out.println(ll);
		
		System.out.println(ll.peek()); // similar to get() but no exceptions
		System.out.println(ll.peekFirst());
		System.out.println(ll);
		
		System.out.println(ll.poll()); // removes & print 1st element (similar to removeFirst() but no exceptions
		System.out.println(ll.pollFirst());
		System.out.println(ll.pollLast()); 
		System.out.println(ll);
		
		// Stack
		System.out.println(ll.pop());
		System.out.println(ll);
		ll.push(100);
		System.out.println(ll);
		
		ll.retainAll(ll2); // Retains only which is common to both
		System.out.println(ll);
		
	}

}
