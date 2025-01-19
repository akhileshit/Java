package strings08;

public class Demo { // compareTo(), trim() and split() Functions
	public static void main(String[] args) {
		
		// compareTo()
		String s1 = "KodNest";
		String s2 = "KodNest";
		
		int res = s1.compareTo(s2);
		
		if (res>0)
			System.out.println("String 1 is Greater");
		else if (res<0)
			System.out.println("String 2 is Greater");
		else if (res==0)
			System.out.println("Both Strings are Equal");
		
		System.out.println("=====================================");
		
		// trim()
		String str = "   Kodnest    ";
		String str2 = str.trim(); // Trim leading and trailing spaces in the string
		
		System.out.println(str);
		System.out.println(str2);
		
		System.out.println("=====================================");
		
		// split()
		String str3 = "KodNest Technologies pvt ltd";
		String str4[] = str3.split(" "); // split the line by removing " "(space characters) and store in array of Strings
		
		System.out.println(str3);
		for (String x : str4)
			System.out.println(x);
	}
}
