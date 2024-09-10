
public class LibraryApp {

	public static void main(String[] args) {
		
		library(new Book("Kaizen", "Rules of Life", 2020, 555554444, 25)); // author, title, year, isbn, pages
		library(new Magazine("Nakamoto", "The Hinderance", 2019, 998, 45)); // author, title, year, issueNumber, frequency
	}
	
	// PolyMorphism
	public static void library(LibraryItem lib) {
		lib.displayDetails();
		lib.calculateRentalFee();
	}
}
