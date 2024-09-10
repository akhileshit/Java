
public class Magazine extends LibraryItem {
	private int issueNumber;
	private int frequency;
	
	@Override
	public void displayDetails() {
	
		System.out.println("Magazine Title: " + getTitle());
		System.out.println("Magazine Author: " + getAuthor());
		System.out.println("Publication Year: " + getPublicationYear());
		System.out.println("Issue number: " + issueNumber);
		System.out.println("Frequency of publication: " + frequency);
	}

	@Override
	public int calculateRentalFee() {
		int fee = frequency * 3;
		System.out.println("Fees: $" + fee);
		System.out.println("=======================================");
		return fee;
	}
	
	// Constructor to set private variables
	public Magazine(String title, String author, int publicationYear, int issueNumber, int frequency) {
		super(title, author, publicationYear);
		if(issueNumber > 0) {
			this.issueNumber = issueNumber;
		}
		else {
			System.out.println("Invalid issueNumber");
		}
		
		if(frequency > 0) {
			this.frequency = frequency;
		}
		else {
			System.out.println("Invalid frequency");
		}
	}
	
	// Getters
	public int getIssueNumber() {
		return issueNumber;
	}
	
	public int getFrequency() {
		return frequency;
	}
	
}
