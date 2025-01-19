package Strings01;

public class Demo { // Comparing Strings
	public static void main(String[] args) {
		String s1 = "Omkar"; // Inside StringPool
		String s2 = "Omkar"; 
		
		String s3 = new String("Omkar"); // Outside StringPool
		String s4 = new String("Omkar");
		
		if (s1 == s2) // Compares addresses!!!!!!!!!!
			System.out.println("References are equal");
		else
			System.out.println("References are unequal");
		
		if (s1.equals(s2))
			System.out.println("Strings are equal");
		else
			System.out.println("Strings are not equal");
		
		
		if (s3 == s4) // Compares addresses!!!!!!!!!!
			System.out.println("s3 reference is equal to s4 reference");
		else
			System.out.println("s3 and s4 references are unequal");
		
		if (s3.equals(s4))
			System.out.println("s3 and s4 Strings are equal");
		else
			System.out.println("s3 and s4 Strings are not equal");
	}
}
