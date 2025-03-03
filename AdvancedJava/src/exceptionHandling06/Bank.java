package exceptionHandling06;

public class Bank {

	void initiateATM() {
		try { // Since needed to accept the re-throwed exception
		System.out.println("CONNECTION TO THE BANK SERVER ESTABLISHED");
		ATM atm = new ATM();
		atm.withdraw();
		}
		catch (Exception e) {
			System.out.println("ISSUE FROM ATM REACHED THE BANK");
		}
		
		System.out.println("CONNECTION TO THE BANK SERVER TERMINATED");
	}

}
