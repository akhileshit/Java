
public class CheckChild extends Check {

	void  forSuperKey() {
		//super(); (or) this();   not possible
		super.a = 1532; // changing parent variable inside child class
		System.out.println(a);
		
	}
}
