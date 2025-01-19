package Strings03;

public class Demo { // Raw-strings concatenation
	public static void main(String[] args) {
		String s1 = "Rama";
		String s2 = "Sita";
		
		String s3 = "Rama" + "Sita"; // inside StringPool 
		String s4 = "Rama" + "Sita";
		
		if (s3 == s4) // Compares addresses!!!!!!!!!!
			System.out.println("References are equal");//
		else
			System.out.println("References are unequal");
		
		if (s3.equals(s4))
			System.out.println("Strings are equal");//
		else
			System.out.println("Strings are not equal");
	}
}
