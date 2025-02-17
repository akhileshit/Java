package collections29;

import java.util.ArrayList;

public class Demo { // without multi-threading
	
public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(86);
		al.add(42);
		al.add(23);
		al.add(18);
		al.add(25);
		
		
		for(Object o : al) {
			System.out.println(o); // Read
			al.add(100); // Write              ConcurrentModificatiionException
		}
		
		System.out.println(al);
	}
}
