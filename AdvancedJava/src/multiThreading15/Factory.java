package multiThreading15;

public class Factory {
	
	int x;
	
	public void setX(int x) { // setter
		this.x = x;
		System.out.println("PRODUCER HAS PRODUCED " + x + " IN FACTORY");
	}
	
	public void getX() { // getter
		System.out.println("CONSUMER HAS CONSUMED " + x + " FROM FACTORY");
	}
}
