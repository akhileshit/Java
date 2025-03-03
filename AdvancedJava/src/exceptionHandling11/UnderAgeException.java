package exceptionHandling11;

public class UnderAgeException extends Exception {
	
	@Override
	public String getMessage() {
		return "YOU CANNOT REGISTER SINCE YOU ARE A MINOR";
	}
}
