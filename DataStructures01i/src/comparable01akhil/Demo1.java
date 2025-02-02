package comparable01akhil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo1 { // "Comparator" Interface       Usage Method2:
	
	public static void main(String[] args) {
		// Creating Anonymous inner class type, instead of writing separate class like(Comparing and there implementing Comparator Interface)
		// Remember this?? We do this for Functional Interfaces (Interfaces with only one abstract method)
		Comparator ref = new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Person p1 = (Person) o1;
				Person p2 = (Person) o2;
				if (p1.age > p2.age) {
					return 1;
				}
				else if(p1.age == p2.age) {
					return 0;
				}
				else {
					return -1;
				}
			}
			
		};
		
		ArrayList al = new ArrayList();
		al.add(new Person("Dhoni",45));
		al.add(new Person("Virat",39));
		al.add(new Person("Hardik",31)); 
		al.add(new Person("Rishab",28));
		al.add(new Person("Rahul",30));
		al.add(new Person("Sachin",50));
		al.add(new Person("Rohith",35));
		System.out.println("Before Sorting  : " + al);
		Collections.sort(al, ref); // Gives Error saying: "The method sort(List<T>) in the type Collections is not applicable for the arguments (ArrayList<Employee>)"                   
		System.out.println("After Sorting   : " + al);
	}
}