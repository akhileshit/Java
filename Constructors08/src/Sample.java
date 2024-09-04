
public class Sample {
	int a;
	int b;
	
	public Sample(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	// Explicit wrote 0-argument constructor to avoid compile-time error
	public Sample() {
		super();
	}
	
}
