package collections24;

import java.util.ArrayList;
import java.util.Collections;

public class Demo { // "Collections" Class (Utility Class) 
	 
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(15);
		al.add(12);
		al.add(22);
		al.add(98);
		al.add(5);
		System.out.println(Collections.min(al)); // collections.min()
		
		// and many more
	}
}
