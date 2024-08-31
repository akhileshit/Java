
public class Main {

	public static void main(String[] args) { // Up-casting and calling static method from another class
		
		CallCalci.acceptCalci(new SimpleCalculator());
		CallCalci.acceptCalci(new AdvanceCalculator());
		CallCalci.acceptCalci(new ScientificCalculator());
	
	}

}
