package multiThreading04;

public class Demo2 extends Thread { // 2nd Independent Thread
	@Override
	public void run() {
		System.out.println("MULTIPLICATION ACTIVITY STARTED");
		int a=10;
		int b=20;
		try {
			Thread.sleep(2000);
		} 
		catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("Multiplication result is: " + a*b);
		System.out.println("MULTIPLICATION ACTIVITY ENDED");
	}
}
