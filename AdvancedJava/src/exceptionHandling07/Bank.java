package exceptionHandling07;

public class Bank {

	void initiateATM() throws Exception/*again*/ {
		try { // Duck it again to the caller
		System.out.println("CONNECTION TO THE BANK SERVER ESTABLISHED");
		ATM atm = new ATM();
		atm.withdraw();
		}
		
		finally { // safeguard the resource
		System.out.println("CONNECTION TO THE BANK SERVER TERMINATED");
		}
	}

}
