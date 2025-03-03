package exceptionHandling06;

public class BankApp {
	
	public static void main(String[] args) { // MAIN method
		System.out.println("MAIN CONNECTION ESTABLISHED");
		Bank bank = new Bank();
		bank.initiateATM();
		System.out.println("MAIN CONNECTION TERMINATED");

	}
}


//CONCLUSION
//NO resources are harmed/lost. And exceptions handled gracefully . And Bank knows that an exception occurred at ATM