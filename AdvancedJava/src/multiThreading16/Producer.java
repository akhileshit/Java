package multiThreading16;

public class Producer extends Thread {
	
	Factory fref;
	
	public Producer(Factory fref) {
		this.fref = fref;
	}
	
	@Override
	public void run() {
		int a=0;
		while (true) {
			fref.setX(a++);
		}
	}
}
