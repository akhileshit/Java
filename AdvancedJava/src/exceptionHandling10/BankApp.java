package exceptionHandling10;

public class BankApp { // Custom Exceptions
	
	public static void main(String[] args) { // MAIN method
		System.out.println("MAIN CONNECTION ESTABLISHED");
		Bank bank = new Bank();
		bank.initiateATM();
		System.out.println("MAIN CONNECTION TERMINATED");
	}
}

