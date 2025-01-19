package strings14;

public class Demo { // StringBuilder and StringBuffer again..
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder("Hello");
		System.out.println(builder);
		builder.append(" World!"); // append()
		System.out.println(builder);
		builder.insert(5, ",");    // insert()
		System.out.println(builder);
		builder.delete(5,6);	   // delete()	
		System.out.println(builder);
		builder.reverse();	   	   // reverse()	 
		System.out.println(builder);
		
		//Reversing concept using inbuilt method
		String str = "Hello";
		StringBuilder b = new StringBuilder(str);
		System.out.println("Original String: " + b); 
		b.reverse();
		System.out.println("Reversed String: " + b); 
	}
}
