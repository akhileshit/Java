
public abstract class LibraryItem {
	private String title;
	private String author;
	private int publicationYear;
	
	public abstract void displayDetails();
	public abstract int calculateRentalFee();
	
	// Constructor to set private variables
	public LibraryItem(String title, String author, int publicationYear) {
		super();
		this.title = title;
		this.author = author;
		if(publicationYear > 0) {
			this.publicationYear = publicationYear;
		}
		else {
			System.out.println("Invalid publication year");
		}
	}
	
	// Getters
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public int getPublicationYear() {
		return publicationYear;
	}
	
}
