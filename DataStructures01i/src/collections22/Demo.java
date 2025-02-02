package collections22;

import java.util.ArrayList;
import java.util.Collections;

public class Demo { // "Comparable" Interface
	
	public static void main(String[] args) {
		
		// Comparing objects of same type
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(50);
		al.add(150);
		al.add(25);
		al.add(75);
		al.add(125);
		al.add(175);
		System.out.println("Before Sorting  : " + al);
		Collections.sort(al);
		System.out.println("After Sorting   : " + al);
		System.out.println("==================================================");
		
		// Comparing non-comparable types
		ArrayList al2 = new ArrayList();
		al2.add(100);
		al2.add(50);
		al2.add(150); 
		al2.add(25.1f);
		al2.add(true);
		al2.add("Sachin");
		al2.add('X');
//		System.out.println("Before Sorting  : " + al2);
//		Collections.sort(al2);                           // Exception
//		System.out.println("After Sorting   : " + al2);
		
		// Comparing objects
		ArrayList<String> al3 = new ArrayList<>(); // if your motive is to "sort" down the lane, then accept only similar type of data using generics
		al3.add("Dhoni");
		al3.add("Virat");
		al3.add("Hardik"); 
		al3.add("Rishab");
		al3.add("Rahul");
		al3.add("Sachin");
		al3.add("Rohith");
		System.out.println("Before Sorting  : " + al3);
		Collections.sort(al3);                           
		System.out.println("After Sorting   : " + al3);
		System.out.println("==================================================");

		
		ArrayList<Employee> al4 = new ArrayList<>(); // Then what about this? How it compares? On what basis?
		al4.add(new Employee("Dhoni",45));
		al4.add(new Employee("Virat",39));
		al4.add(new Employee("Hardik",31)); 
		al4.add(new Employee("Rishab",28));
		al4.add(new Employee("Rahul",30));
		al4.add(new Employee("Sachin",50));
		al4.add(new Employee("Rohith",35));
		System.out.println("Before Sorting  : " + al4);
		Collections.sort(al4); // Gives Error saying: "The method sort(List<T>) in the type Collections is not applicable for the arguments (ArrayList<Employee>)" (or) Exception like "Employee cannot be cast to class java.lang.Comparable". Implement "Comparable" interface and overriding compareTo() in Employee class. STATUS: Handled            
		System.out.println("After Sorting   : " + al4);
		// The Class which implements "Comparable" and overrides its compareTo() method, Can only be compared, Otherwise Not comparable
	}
}
