package strings18;

public class Demo {
	public static void main(String[] args) { // Regular Expression Matching
		
		String str = "H";
		System.out.println(str.matches("[A-Z]")); // single Alphabet CAPS 
		
		String str1 = "Hello";
		System.out.println(str1.matches("[A-Za-z]+")); // any #alphabets CAPS or Small
		
		String str8 = "Hello123";
		System.out.println(str8.matches("[A-Za-z0-9]+")); // any #alphabets CAPS or Small
		
		String str2 = " ";
		System.out.println(str2.matches(".")); // 'any' 'single' char except newline
		
		String str3 = "  skdfngkjn2343/@#$\t\\  . .   ><;:\" '=+_)(*&%-  Hello boy  " ;
		System.out.println(str3.matches(".+")); // 1 or more # any(.) characters
		
		String str4 = "";
		System.out.println(str4.matches(".*")); // 0 or more # any(.) characters
		
		String str5 = "hhhhhhhh";
		System.out.println(str5.matches("h*")); // 0 or more # 'h' 
		
		String str6 = "t";
		System.out.println(str6.matches("t?")); // 0 or 1 't' 
		
		String str7 = "hgh";
		System.out.println(str7.matches("[hg]{3}+")); // 'Exactly 3' chars with h/g             
		
	} 
	
}
