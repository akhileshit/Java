package collections23__;

import java.util.ArrayList;
import java.util.Collections;


public class Demo { // I'am using Comparable Interface by extending the Parent Class
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(new PersonX("Dhoni",45));
		al.add(new PersonX("Virat",39));
		al.add(new PersonX("Hardik",31)); 
		al.add(new PersonX("Rishab",28));
		al.add(new PersonX("Rahul",30));
		al.add(new PersonX("Sachin",50));
		al.add(new PersonX("Rohith",35));
		System.out.println("Before Sorting  : " + al);
		Collections.sort(al);; // Gives ClassCastException saying: "class collections23__.Comparing cannot be cast to class java.lang.Comparable".Hence implement Comparable interface and Override compareTo() in Comparing class. STATUS: Done                  
		System.out.println("After Sorting   : " + al);
	}
}

