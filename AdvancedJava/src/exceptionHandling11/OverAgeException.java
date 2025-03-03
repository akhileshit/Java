package exceptionHandling11;

public class OverAgeException extends Exception {
	
	@Override
	public String getMessage() {
		return "YOU CANNOT REGISTER SINCE YOU ARE AGED MORE THAN FIFTY";
	}
}
