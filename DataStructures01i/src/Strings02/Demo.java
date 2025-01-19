package Strings02;

public class Demo { // String concatenation using their references
	public static void main(String[] args) {
		String s1 = "Rama";
		String s2 = "Sita";
		
		String s3 = s1 + s2; // outside stringPool (if used + and references)
		String s4 = s1 + s2;
		
		if (s3 == s4) // Compares addresses!!!!!!!!!!
			System.out.println("References are equal");
		else
			System.out.println("References are unequal");//
		
		if (s3.equals(s4))
			System.out.println("Strings are equal");//
		else
			System.out.println("Strings are not equal");
		
		System.out.println(s3);
	}
}
