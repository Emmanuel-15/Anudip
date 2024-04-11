// Create a Book class with bookId, bookName and authorName.
// Create parameterized constructor to initialize the object. 
// Create an ArrayList of type Book and store all book objects into collections and display all book details.
// [Hint:Use advanced for loop to display all Books details]

package collc_ajwp;

// importing arrayList class
import java.util.ArrayList;

// created class book with following attributes
class book {
	int bookId;
	String bookName;
	String authorName;

	// Parameterized constructor
	public book(int bookId, String bookName, String authorName) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
	}
}

// main class
public class lab1_a1_book_class {

	public static void main(String[] args) {

		// creating an arrayList of type books
		ArrayList<book> books = new ArrayList<>();

		// adding values to arrayList
		books.add(new book(1, "The Hitchhiker's Guide to the Galaxy", "Douglas Adams"));
		books.add(new book(2, "One Hundred Years of Solitude", "Gabriel Garcia Marquez"));
		books.add(new book(3, "Catch-22", "Joseph Heller"));

		// using advance for loop in order to access arrayList elements
		for (book book : books) {
			System.out.println("Book ID: " + book.bookId);
			System.out.println("Book Name: " + book.bookName);
			System.out.println("Author Name: " + book.authorName);
			System.out.println();
		}
	}
}