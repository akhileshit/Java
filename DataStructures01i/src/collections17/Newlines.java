package collections17;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Newlines {
	
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<>();
		
		TreeMap tm = new TreeMap<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter " + n + " Strings");
		for (int i=0; i<n; i++) {
			ts.add(sc.next());
		}	
		
		System.out.println(ts);
	}
}
