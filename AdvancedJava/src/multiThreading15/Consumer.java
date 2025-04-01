package multiThreading15;

public class Consumer extends Thread {
	
	Factory fref;
	
	public Consumer(Factory fref) {
		this.fref = fref;
	}
	
	@Override
	public void run() {
		while (true) {
			fref.getX();
		}
	}
}
