package Strings04;

public class Demo { // concat()
	public static void main(String[] args) {
		String s1 = "Kodnest";
		System.out.println(s1); // Kodnest
		
		s1.concat("Technologies"); // s1 is immutable , hence new string(KodnestTechnologies) gets created inside stringPool with new address
		System.out.println(s1); // Kodnest
		
		
		String s2 = s1.concat("Technologies");
		System.out.println(s1); // Kodnest
		System.out.println(s2); // KodnestTechnologies
		
			//or
		s1 = s1.concat("Technologies");
		System.out.println(s1); // KodnestTechnologies
	}
}
