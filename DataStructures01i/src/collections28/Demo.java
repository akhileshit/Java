package collections28;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class Demo { // WeakHashMap and IdentityHashMap
	
	public static void main(String[] args) {
		
		WeakHashMap wm = new WeakHashMap(); // WeakHashMap
		
		Object key1 = new Integer(25); // GC Only Collects objects, Hence created new objects
		Object key2 = new Integer(35);
		Object key3 = new Integer(45);
		Object key4 = new Integer(105);
		Object key5 = new Integer(112);
		
		wm.put(key1, "Kodnest");
		wm.put(key2, "Technologies");
		wm.put(key3, "pvt");
		wm.put(key4, "ltd");
		wm.put(key5, "com");
		
		System.out.println("Before GC : " + wm);
		
		key4 = null; // Make key4 point to "null"
		key2 = null; // Make key2 point to "null"
		
		System.gc(); // Calling Garbage Collector
		
		// Give some time for Garbage Collector
		for (int i=0; i<500; i++) { 
			System.out.print(""); 
		}
		
		System.out.println("After GC  : " + wm);
		

		System.out.println("==========================================================");
		System.out.println("==========================================================");
		
		
		String k1= new String("100");
		String k2= new String("100");
		String k3= new String("100");
		String k4= new String("100");
//		String k1= "100";  // These don't work since all are in StringPool where no duplicate exists, hence all variables points to same data, hence same reference addresses
//		String k2= "100";
//		String k3= "100";
//		String k4= "100";
		
		IdentityHashMap im = new IdentityHashMap(); // IdentityHashMap
		im.put(k1, "Kodnest");
		im.put(k2, "Technologies");
		im.put(k3, "pvt");
		im.put(k4, "ltd");
//		im.put(128, "Kodnest"); // This Works!! due to Auto-Boxing(128) to Integer type
//		im.put(128, "Technologies");
//		im.put(128, "pvt");
//		im.put(128, "ltd");
//		im.put(1, "Kodnest"); // This Wont Work!! WHY??  SEE BELOW(@ end of code)
//		im.put(1, "Technologies");
//		im.put(1, "pvt");
//		im.put(1, "ltd");
		
		System.out.println("IdentityHashMap  : " + im);
		
		HashMap hm = new HashMap(); // Normal HashMap
		hm.put(k1, "Kodnest");
		hm.put(k2, "Technologies");
		hm.put(k3, "pvt");
		hm.put(k4, "ltd");
		
		System.out.println("Normal HashMap   : " + hm);
		
		
		// IdentityHashMap - hashing happens on ref addresses
		// HashMap - hashing happens on values inside objects (using hashCode() and equals() )
	}
}


// Why it wont work?
/*
 * Due to Wrapper Class Caching:
 * Integers  from -127 to 127
 * Short     from -127 to 127
 * Byte		 from -127 to 127
 * Long		 from -127 to 127
 * Character from 0 to 127
 * Float	 NO CACHING
 * Double    NO CACHING
 * 
 * */
 