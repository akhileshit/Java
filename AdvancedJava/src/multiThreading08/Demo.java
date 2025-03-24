package multiThreading08;

public class Demo { // Main Thread waiting until all the threads finished execution    " join() "
	
	public static void main(String[] args) {
		System.out.println("Main Thread Started and Resources are Allocated.");
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
		t3.start();
		
		t1.join(); // wait until t1 joins you
		t2.join(); // wait until t2 joins you
		t3.join(); // wait until t3 joins you
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Main Thread Ended and Resources are Deallocated.");

	}
}
