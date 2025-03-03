package exceptionHandling11;

public class Matrimony {
	
	void initiateRegistration() {
		
		try {
		Registration r = new Registration();
		r.register();
		}
		catch (OverAgeException e1) {
			System.out.println("EXCEPTION REACHED MATRIMONY SERVER");
			System.out.println("REGISTRATION UNSUCCESSFUL");
		}
		catch (UnderAgeException e1) {
			System.out.println("EXCEPTION REACHED MATRIMONY SERVER");
			System.out.println("REGISTRATION UNSUCCESSFUL");
		}
	}
}
