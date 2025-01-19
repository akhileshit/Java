package strings09;

public class Demo { // MUTABLE STRINGS
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("KodNest"); // Mutable
		System.out.println(s); // Original
		s.append(" Technologies Limited");
		System.out.println(s); // Mutated String
		//s.concat(" Hello"); // Error
		String res = s.toString(); // Optional. if you want to perform string operations on s
		res.concat(" Hello"); // No Error
		
		System.out.println("======================"); 
					
						// or
		StringBuilder s1 = new StringBuilder("Hello"); // Mutable
		System.out.println(s1); // Original
		s1.append(" Java!!!");
		System.out.println(s1); // Mutated String
		
	}
}
