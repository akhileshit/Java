package collections29;

import java.util.concurrent.CopyOnWriteArrayList; // inside concurrent package

public class Demo1 { // Concurrent Collections (Multi-threaded Collections)
	
	public static void main(String[] args) {
		
		// For every collection class in normal collection we have an alternative class in concurrent collections which supports multi-threading
		// One of is ArrayList
		CopyOnWriteArrayList cal = new CopyOnWriteArrayList();
		
		cal.add(86);
		cal.add(42);
		cal.add(23);
		cal.add(18);
		cal.add(25);
		
		for(Object o : cal) {
			System.out.println(o); // Read
			cal.add(100); // Write
		}
		
		System.out.println(cal);
	}
}
