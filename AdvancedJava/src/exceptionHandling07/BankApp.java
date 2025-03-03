package exceptionHandling07;

public class BankApp {
	
	public static void main(String[] args) { // MAIN method
		
		try { // Handling Exception Here
		System.out.println("MAIN CONNECTION ESTABLISHED");
		Bank bank = new Bank();
		bank.initiateATM();
		}
		catch (Exception e) {
			System.out.println("EXCEPTION REACHED MAIN AND HANDLED");
		}
		
		System.out.println("MAIN CONNECTION TERMINATED");
	}
}

//						(or)


//public static void main(String[] args) throws Exception/*Mandatory*/ { // MAIN method
//	
//	try { // Ducking even from here and leaving it to handle by DEH (peaceful termination after safeguarding all resources with complete exception message also)
//	System.out.println("MAIN CONNECTION ESTABLISHED");
//	Bank bank = new Bank();
//	bank.initiateATM();
//	}
//	
//	finally { // Mandatory
//	System.out.println("MAIN CONNECTION TERMINATED");
//	}
//}

// CONCLUSION
// NO resources are harmed/lost. And exceptions handled gracefully . And All of them know that an exception occurred