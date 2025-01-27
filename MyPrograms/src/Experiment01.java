

// Run this program to see what the experiment is
class Book { 
	String title;
	String author;
	
	void displayBookDetails() {
		System.out.println("Book:" + title);
		System.out.println("Author:" + author);
	}
}

class Library {
	Book libraryBook;
	
	void addBook(Book newBook) {
		libraryBook = newBook;
	}
	
	void showBook() {
		libraryBook.displayBookDetails();
	}
}

public class Experiment01 {
	public static void main(String[] args) {
		 Library myLibrary = new Library();
		 myLibrary.libraryBook.title = "Hello";
		 myLibrary.libraryBook.author = "John";
		 
		 myLibrary.showBook();
		 
	}
}

//*******************************************************************************
// Also run this

//class Book { 
//	static String title;
//	static String author;
//	
//	void displayBookDetails() {
//		System.out.println("Book:" + title);
//		System.out.println("Author:" + author);
//	}
//}
//
//class Library {
//	Book libraryBook;
//	
//	void addBook(Book newBook) {
//		libraryBook = newBook;
//	}
//	
//	void showBook() {
//		libraryBook.displayBookDetails();
//	}
//}
//
//public class Experiment01 {
//	public static void main(String[] args) {
//		 Library myLibrary = new Library();
//		 Book.title = "Hello";
//		 Book.author = "John";
//		 
//		 myLibrary.showBook();
//		 
//	}
//}

//*******************************************************************************

// Also this

//class Book { 
//	static String title;
//	static String author;
//	
//	static void displayBookDetails() {
//		System.out.println("Book:" + title);
//		System.out.println("Author:" + author);
//	}
//}
//
//class Library {
//	Book libraryBook;
//	
//	void addBook(Book newBook) {
//		libraryBook = newBook;
//	}
//	
//	void showBook() {
//		libraryBook.displayBookDetails();
//	}
//}
//
//public class Experiment01 {
//	public static void main(String[] args) {
//		 Library myLibrary = new Library();
//		 Book.title = "Hello";
//		 Book.author = "John";
//		 
//		 myLibrary.showBook();
//		 
//	}
//}

//*******************************************************************************
// AGGREGATION
// ALSO SHOWS THE STATIC AND NON-STATIC NATURE
// TELLS CREATING OBJECT OF ONE CLASS INSIDE ANOTHER CLASS(COMPOSITION) IS IMPORTANT, AND ONLY REFERENCES 
//DOESN'T WORK TO ACCESS IT LIKE THE ABOVE IF THE METHODS AND VARIABLES ARE NON-STATIC.


