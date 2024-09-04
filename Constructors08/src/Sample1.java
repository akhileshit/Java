
public class Sample1 extends Sample {
	int x;
	int y;
	
	public Sample1(int x, int y) {
		// this line will have "super();" by default
		this.x = x;
		this.y = y;
	}
	
	void displaySample() {
		System.out.println(a + " " + b);
		System.out.println(x + " " + y);
	}
}
