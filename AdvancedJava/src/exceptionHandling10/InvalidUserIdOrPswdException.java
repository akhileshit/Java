package exceptionHandling10;

public class InvalidUserIdOrPswdException extends Exception { // Our Custom Exception
	
	@Override
	public String getMessage() {
		return "ENTER VALID USER ID OR PSWD";
	}
}
