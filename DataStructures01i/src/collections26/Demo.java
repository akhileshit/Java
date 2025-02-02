package collections26;

import java.util.HashMap;
import java.util.Map;

import collections21.Employee;

public class Demo { // Some more methods of Maps
	
	public static void main(String[] args) {
		
		HashMap hm = new HashMap();  
		hm.put(86, new Employee("Omkar", 24)); 
		hm.put(42, new Employee("Prahllad", 22));
		hm.put(23, new Employee("Bharadwaj", 19));
		hm.put(18, new Employee("Abhaya", 23));
		hm.put(25, new Employee("Parineeth", 25));
		System.out.println(hm.get(86));
		System.out.println(hm.containsKey(18)); // containsKey()
		System.out.println(hm.containsValue(new Employee("Bharadwaj", 19))); //containsValue()   //False becaz here new object is getting created and hence address diff. Want "true"? then go and override equals() method in Employee !!	
		System.out.println(hm); 
		System.out.println("===================================================");
		
		
		
		Map<Integer, String> map = new HashMap<>(); // Just UpCasting (nothing much)
		map.put(100, "Kodnest");
		map.put(200, "Technologies");
		map.put(300, "pvt");
		map.put(400, "ltd");
		System.out.println(map);
		System.out.println(map.containsValue("pvt")); // containsValue()
		System.out.println(map.remove(100)); // remove()
		System.out.println(map);
		System.out.println("===================================================");

		
		Map<Integer, String> map1 = new HashMap<>(); // Just UpCasting (nothing much)
		map1.put(10, "Kodnest");
		map1.put(20, "Technologies");
		map1.put(30, "pvt");
		map1.put(40, "ltd");
		System.out.println(map1);
		map1.putAll(map);         // putAll()
		System.out.println(map1);
	}
}
