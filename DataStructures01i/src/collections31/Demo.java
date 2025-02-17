package collections31;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Demo {
	
	public static void main(String[] args) {
		
		ConcurrentHashMap<Integer, Object> chm = new ConcurrentHashMap<>();
		chm.put(1, 100);
		chm.put(2, "Hello");
		chm.put(3, 400);
		chm.put(4, 555);
		
		System.out.println(chm);
		int a = 4;
		for(Object e: chm.values()) {
			System.out.println(e);
			chm.put(++a, 50);
		}
		
		System.out.println(chm);
		System.out.println(chm);
		
		System.out.println(chm.get(1)); 

	}
}
