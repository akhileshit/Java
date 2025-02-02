package collections05;

import java.util.LinkedList;

public class Demo { // LinkedList
	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		
		ll.add(12);
		ll.add(15);
		ll.add(11);
		ll.add(50);
		ll.add(50);
		ll.add(null);
		System.out.println(ll);
		
		System.out.println(ll.contains(175));
		System.out.println(ll.get(1));
		System.out.println(ll.indexOf(175));
		System.out.println(ll.isEmpty());
		
		LinkedList ll2 = new LinkedList();
		ll2.add(3.1);
		ll2.add(3.2);
		ll2.add(3.3);
		
		ll.addAll(ll2);
		System.out.println(ll);
		
		ll.addAll(0,ll2);
		System.out.println(ll);
	}
}

/*Is dynamic (Growing and shrinking in size as in when data comes and goes
 *Accepts Object type data
 *But this DOESN'T requires continuous mem loc.*/
