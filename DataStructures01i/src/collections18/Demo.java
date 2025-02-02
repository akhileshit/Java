package collections18;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Demo {	// Add ArrayList elements to TreeSet
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ArrayList al = new ArrayList();
		TreeSet ts = new TreeSet();
		
		
		System.out.println("How many elements you want to add to the list? ");
		int n = scan.nextInt();
		System.out.println("Enter " + n + " Elements (Try to add duplicates!");
		for (int i=0; i<n; i++) {
			al.add(scan.nextInt());
		}
		
		System.out.println("ArrayList " + al);
	
		
		System.out.println(ts);
		ts.addAll(al);  // Add all the elements of ArrayList to TreeSet
		System.out.println("TreeSet   " + ts);
		
		
	}
}
