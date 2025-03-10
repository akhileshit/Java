package multiThreading02;

public class Demo {
	
	public static void main(String[] args) { // Controlling Thread Execution using sleep()
		
		try {
		System.out.println("Hello Thread");
		for (int i=0; i<10; i++) {
			Thread.sleep(3000); // Throws Checked Exception
			System.out.println("KODNEST");
		}
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
