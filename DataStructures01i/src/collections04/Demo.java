package collections04;

import java.util.ArrayList;

public class Demo { // ArrayList
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(100);
		al.add("Ramu");
		al.add('C');
		al.add(true);
		al.add(3.141f);
		al.add(75.121212);
		al.add(175L);
		
		System.out.println(al);
		
		System.out.println(al.contains(175));
		System.out.println(al.get(1));
		System.out.println(al.indexOf(175));
		System.out.println(al.isEmpty());
		
		ArrayList al2 = new ArrayList();
		al2.add(3.1);
		al2.add(3.2);
		al2.add(3.3);
		
		al.addAll(al2);
		System.out.println(al);
		
		al.addAll(0,al2);
		System.out.println(al);
	}
}

// Diff b/w normal array and arrayList
/*Is dynamic (Growing and shrinking in size as in when data comes and goes
 *Accepts Object type data
 *But this also requires continuous mem loc.*/
