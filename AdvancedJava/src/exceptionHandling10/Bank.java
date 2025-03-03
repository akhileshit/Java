package exceptionHandling10;

public class Bank {

	void initiateATM() {
		ATM atm = new ATM();
		try { // giving 3 chances to the user
		atm.withdraw();
		}
		catch (InvalidUserIdOrPswdException e) {
			try {
				atm.withdraw();
				}
				catch (InvalidUserIdOrPswdException e1) {
					try {
						atm.withdraw();
						}
						catch (InvalidUserIdOrPswdException e2) {
							System.out.println("IDIOT WRONG USER ID OR PWD. CARD BLOCKED. GET LOST.");
						}
				}
		}

	}

}
