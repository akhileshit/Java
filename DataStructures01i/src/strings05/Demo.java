package strings05;

public class Demo { // equalsIgnoreCase()
	public static void main(String[] args) {
		String s1 = "KODNEST";
		String s2 = "kodnest";
		
		if (s1 == s2) // Compares addresses!!!!!!!!!!
			System.out.println("References are equal");
		else
			System.out.println("References are unequal");
		
		if (s1.equals(s2))
			System.out.println("Strings are equal");
		else
			System.out.println("Strings are not equal");
		
		if (s1.equalsIgnoreCase(s2))
			System.out.println("Strings are equal when cases ignored.");
		else
			System.out.println("Strings are not equal even after cases ignored.");
	}
}
