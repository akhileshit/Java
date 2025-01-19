package strings07;

public class Demo { // charArray() and intern() methods
	public static void main(String[] args) {
		String str = "RajaRamMohanRoy";
		
		System.out.println(str);
		
		char [] arr = str.toCharArray(); 
		for (char x: arr)
			System.out.print(x + " ");
		
		String str2 = new String("Omkar");
		String str3 = str2.intern(); // make a copy in StringPool
		
		String str4 = "Omkar"; // same as str3
		
		// Verify
		if(str3 == str4)
			System.out.println("str3 and str4 References are equal");
		else
			System.out.println("str3 and str4 References are Unequal");
			
		
		
	}
}
