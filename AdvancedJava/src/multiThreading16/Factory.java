package multiThreading16;

public class Factory { // changes made here
	
	int x;
	boolean isProduced = false;
	
	public synchronized void setX(int x) { // setter
		try {
		if (isProduced == true) {
			wait(); // 
		}
		
		this.x = x;
		System.out.println("PRODUCER HAS PRODUCED " + x + " IN FACTORY");
		isProduced = true;
		notify(); //
		}
		
		catch (Exception e) {
			e.printStackTrace();		
		}
	}
	
	public synchronized void getX() { // getter
		try {
		if (isProduced == false) {
			wait();
		}
		
		System.out.println("CONSUMER HAS CONSUMED " + x + " FROM FACTORY");
		isProduced = false;
		notify();
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
