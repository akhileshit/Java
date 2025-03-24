package multiThreading06;

public class Demo { // Multi-Threading using Runnable Interface (single class (single run()))
	
	public static void main(String[] args) {
		
		Demo1 d1 = new Demo1();
		
		// Creating Thread classes itself and specifying which run() method to run
		Thread t1 = new Thread(d1); // giving a runnable class's reference which has run()
		Thread t2 = new Thread(d1);
		Thread t3 = new Thread(d1);
		
		t1.setName("type");
		t2.setName("multiply");
		t3.setName("search");
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}
// But to create 3 separate threads with main thread we "have" to create Thread objects. There is no choice for it
// Just Runnable classes isn't sufficient. "Thread is Thread"