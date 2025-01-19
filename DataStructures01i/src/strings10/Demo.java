package strings10;

public class Demo { // capacity(), ensureCapacity() functions in Mutable strings

	public static void main(String[] args) {
		StringBuffer s = new StringBuffer(); 
		System.out.println(s.capacity()); // Initial Capacity of StringBuffer (16 DEFAult)
		s.append("KodNest");
		System.out.println(s.capacity()); // Remains 16
		s.append(" Technologies Limited");
		System.out.println(s.capacity()); // new_capacity = old_capacity*2 + 2
		
		s.ensureCapacity(150); // Ensuring predicted capacity beforehand (avoiding calculations done by jvm during run-time)
		s.append("Strings are sequences of characters used to store and manipulate text. They are immutable in many languages.");
		System.out.println(s.capacity()); 
		
		System.out.println("======================"); 
		
		// Exactly same as StringBuffer
		StringBuilder s1 = new StringBuilder();
		System.out.println(s1.capacity()); 
		s1.append("KodNest");
		System.out.println(s1.capacity()); 
		s1.append(" Technologies Limited");
		System.out.println(s1.capacity()); 
		
		s1.ensureCapacity(150); 
		s1.append("Strings are sequences of characters used to store and manipulate text. They are immutable in many languages.");
		System.out.println(s1.capacity());

	}

}
