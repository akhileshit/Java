package collections09;

import java.util.LinkedList;

public class Demo { // Using GENERICS with Collections
	
	public static void main(String[] args) {
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		ll.add(100);
		ll.add(50);
		ll.add(150);
		ll.add(75);
		ll.add(175);
		ll.add(200);
		ll.size();
		
		System.out.println(ll);
		System.out.println("=====================================");
		
		LinkedList<Employee> ll2 = new LinkedList<Employee>();
		
		ll2.add(new Employee(1, "Omkar", 100000));
		ll2.add(new Employee(2, "Prahllad", 200000));
		
		System.out.println(ll2); // Viola!!!!!!!!
		System.out.println("=====================================");
		
		LinkedList ll4 = new LinkedList();
		
		ll4.add(new Employee(1,"Omkar",100000));
		ll4.add(100);
		ll4.add(3.147);
		
		System.out.println(ll4);
		
		
	}
}
