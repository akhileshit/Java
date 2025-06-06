package collections16;

import java.util.Collections;
import java.util.PriorityQueue;

public class Demo { // PriorityQueue
	
	public static void main(String[] args) {
		
		PriorityQueue pq = new PriorityQueue();
		
		pq.add(100);
		pq.add(175);
		pq.add(25); // Priority (minHeap)
		pq.add(25); 
		pq.add(150);
		pq.add(75);
		pq.add(50);
		pq.add(125);
		pq.add(125);
		//pq.add(null);
		
		System.out.println(pq);
		
		pq.poll(); // Root removed(min element)
		System.out.println(pq);
		pq.poll();
		System.out.println(pq);
		pq.poll();
		System.out.println(pq);
		
		// Observe Order Changes (Natural Ordering (Integers))
	}
}
