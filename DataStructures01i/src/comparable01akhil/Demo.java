package comparable01akhil; 

import java.util.ArrayList;
import java.util.Collections;

public class Demo { // "Comparator" Interface      Usage Method1:
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(new Person("Dhoni",45));
		al.add(new Person("Virat",39));
		al.add(new Person("Hardik",31)); 
		al.add(new Person("Rishab",28));
		al.add(new Person("Rahul",30));
		al.add(new Person("Sachin",50));
		al.add(new Person("Rohith",35));
		System.out.println("Before Sorting  : " + al);
		Collections.sort(al, new Comparing()); // (Whom to compare, Based on what to compare). Based on what to compare is written inside overridden method compare() from "Comparator" class               
		System.out.println("After Sorting   : " + al);
	}
}

// Why do this?
// when u forget to implement "Comparable" class which has "compareTo()" method which is used by Collections.sort() to "compare & sort the elements".
// when u forget u can make use of overloaded method  Collections.sort( , ) and the "Comparator" class.