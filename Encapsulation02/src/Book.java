
public class Book extends LibraryItem {
	private int isbn;
	private int numberOfPages;
	
	@Override
	public void displayDetails() {
		
		System.out.println("Book Title: " + getTitle());
		System.out.println("Book Author: " + getAuthor());
		System.out.println("Publication Year: " + getPublicationYear());
		System.out.println("ISBN: " + isbn);
		System.out.println("Pages: " + numberOfPages);
	}

	@Override
	public int calculateRentalFee() {
		int fee = numberOfPages * 2;
		System.out.println("Fees: $" + fee);
		System.out.println("=======================================");
		return fee;
	}
	
	// Constructor to set private variables
	public Book(String title, String author, int publicationYear, int isbn, int numberOfPages) {
		super(title, author, publicationYear);
		if(isbn > 0) {
			this.isbn = isbn;
		}
		else {
			System.out.println("Invalid isbn");
		}
		
		if(numberOfPages > 0) {
			this.numberOfPages = numberOfPages;
		}
		else {
			System.out.println("Invalid numberOfPages");
		}
	}
	
	// Getters
	public int getIsbn() {
		return isbn;
	}
	
	public int getNumberOfPages() {
		return numberOfPages;
	}
	
	
	
	

}
