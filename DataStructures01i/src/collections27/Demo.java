package collections27;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo { // Map Views  - methods of maps to traverse & retrieve the map elements
	
	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>(); // Just UpCasting (nothing much)
		map.put(100, "Kodnest");
		map.put(200, "Technologies");
		map.put(300, "pvt");
		map.put(400, "ltd");
		System.out.println(map);
		System.out.println();
		
		Collection c = map.values(); // values()   //collection of values
		Set ks = map.keySet();	// keySet()		   //set of keys	
		Set es = map.entrySet(); // entrySet()	   //set of entries	
		
		
		Iterator itr = c.iterator(); // values()
		System.out.print("VALUES    : ");
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println();
		
		Iterator itr1 = ks.iterator(); // keySet()
		System.out.print("KEYS      : ");
		while (itr1.hasNext()) {
			System.out.print(itr1.next() + " ");
		}
		System.out.println();
		
		Iterator itr2 = es.iterator(); // emptySet()
		System.out.print("KEY=VALUE : ");
		while (itr2.hasNext()) {
			System.out.print(itr2.next() + " ");
		}
		System.out.println();
		System.out.println();
		System.out.println("==================================================================");

		for (Object s : map.values()) {
			System.out.println(s);
		}
		
		for (Object s : map.keySet()) {
			System.out.println(s);
		}
		
		for (Object s : map.entrySet()) {
			System.out.println(s);
		}

		
//		for (Map.Entry s : map.entrySet()) {
//			System.out.println(s.getKey()); // getKey()
//		}
		
	}

}
