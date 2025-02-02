package collections25;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import collections21.Employee; // i imported

public class Demo { // Maps    - NOT A PART OF JAVA'S COLLECTION FRAMEWORK
	
	public static void main(String[] args) {
		
		HashMap hm = new HashMap();  
		hm.put(86, new Employee("Omkar", 24)); // hm.put(Key, Value)
		hm.put(42, new Employee("Prahllad", 22)); // put()
		hm.put(23, new Employee("Bharadwaj", 19));
		hm.put(18, new Employee("Abhaya", 23));
		hm.put(25, new Employee("Parineeth", 25));
		System.out.println(hm.get(86));      // get()
		System.out.println(hm); // Print Order non-predictable
		System.out.println("===================================================");
		
		HashMap<String, Integer> hm1 = new HashMap<>(); // Print Order non-predictable 
		hm1.put("A", 24); 
		hm1.put("B", 22);
		hm1.put("C" , 19);
		hm1.put("D", 23);
		hm1.put("E", 25);
		System.out.println(hm1); // but showing insertion order only(may be because of natural ordering of Alphabet character)
		System.out.println("===================================================");
		
		LinkedHashMap<Integer, Employee> lhm = new LinkedHashMap<>(); // Print Order same as Insertion-order (obviously on key)
		lhm.put(86, new Employee("Omkar", 24)); 
		lhm.put(42, new Employee("Prahllad", 22));
		lhm.put(23, new Employee("Bharadwaj", 19));
		lhm.put(18, new Employee("Abhaya", 23));
		lhm.put(25, new Employee("Parineeth", 25));
		System.out.println(lhm);
		System.out.println("===================================================");
		
		TreeMap<Integer, Employee> tm = new TreeMap<>(); // Print Order Sorted (obviously on key)
		tm.put(86, new Employee("Omkar", 24)); 
		tm.put(42, new Employee("Prahllad", 22));
		tm.put(23, new Employee("Bharadwaj", 19));
		tm.put(18, new Employee("Abhaya", 23));
		tm.put(25, new Employee("Parineeth", 25));
		System.out.println(tm);
		System.out.println("===================================================");
		
		Map<Integer, String> map = new HashMap<>(); // Just UpCasting (nothing much)
		map.put(100, "Kodnest");
		map.put(200, "Technologies");
		map.put(300, "pvt");
		map.put(400, "ltd");
		System.out.println(map);
		
	}
}

// Analogy - Think "KEY" as your AADHAAR# and "VALUE" as your COMPLETE DATA
// Keys should be unique
// Even if it is not given unique, maps will remove duplicates, only keeping one copy with the "latest Value"
// Using Keys only everything happens, like:
//	-retrieval
//	-removal
