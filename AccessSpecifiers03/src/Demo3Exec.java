
public class Demo3Exec implements Demo3 { // Output for Demo3
	public static void main(String[] args) {
		new Demo3Exec().displayShow(); // just created an object of the same class to access non-static method inside static method 
	}
	
	void displayShow() {
		Demo3.display2(); // because of static
		display3();
	}
}
