
public class UncheckedExc {
	
	public static void main(String[] args) {
		
		UncheckedExc u = new UncheckedExc();
		u.call1();
		
	}
	
	
	
	void call1() {
		throw new ArithmeticException("THis is built-in arithmetic exception"); 
	}
	
}




// NO need to use "throws"

