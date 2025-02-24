package exceptionHandling03;

public class Demo { // Runtime Errors 
	
	public static void main (String[] args) {
		
		System.out.println("Connection Established");
		add(10, 20);
		System.out.println("Connection Terminated");
	}
	
	public static void add(int a, int b) { // StackOverflowError
		//try {
		System.out.println(a+b);
		add(a, b);
		//}
//		catch (Error e) {
//			System.out.println("Some error occurred. Please try again......");
//		}
	}
}

// Try this without try-catch block. You'll see the StackOverflowError happened due to recursive calling without any conditions or base case