package exceptionHandling05;

public class Bank {

	void initiateATM() {
		System.out.println("CONNECTION TO THE BANK SERVER ESTABLISHED");
		ATM atm = new ATM();
		atm.withdraw();
		System.out.println("CONNECTION TO THE BANK SERVER TERMINATED");

	}

}
