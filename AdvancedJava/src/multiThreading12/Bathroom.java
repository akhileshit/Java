package multiThreading12;

public class Bathroom implements Runnable {
	
	@Override
	synchronized public void run() { // "synchronized" keyword locks the shared resource while one thread is using it. Others go to "Blocked" state
		try {
		System.out.println(Thread.currentThread().getName() + " is Entering the Bathroom");
		Thread.sleep(5000);
		System.out.println(Thread.currentThread().getName() + " is Using the Bathroom");
		Thread.sleep(5000);
		System.out.println(Thread.currentThread().getName() + " is Coming out of the Bathroom");
		Thread.sleep(5000);
		
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

// Only just the Keyword "synchronized" makes the difference here
// This type of lock called SEMAPHORE/MONITOR