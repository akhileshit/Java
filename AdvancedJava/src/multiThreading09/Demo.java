package multiThreading09;

public class Demo { // Interrupting a Thread (while sleeping)     " interrupt() "

	public static void main(String[] args) {
		try {
		Demo1 d1 = new Demo1();
		
		Thread t1 = new Thread(d1);
		Thread t2 = new Thread(d1);
		Thread t3 = new Thread(d1);
		
		t1.setName("type");
		t2.setName("multiply");
		t3.setName("search");
		
		t1.start();
		t2.start();
		
		// Multiplication Dies before Executing!!!
		t2.interrupt(); // Thread t2 got interrupted while sleeping. Go to "DEAD" state and never completes its execution!!
		
		t3.start();
		}
		
		catch (Exception e) {  // To catch the interrupted exception gracefully
			e.printStackTrace();
		}
	}
}
