package Assignment2;

public class Q2Book {
	private String bookTitle,author,ISBN;
	private int numOfCopies;
	
	public Q2Book() {
		
	}
	
	public Q2Book(String bookTitle, String author, String iSBN, int numOfCopies) {
		this.bookTitle = bookTitle;
		this.author = author;
		ISBN = iSBN;
		this.numOfCopies = numOfCopies;
	}
	
	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public int getNumOfCopies() {
		return numOfCopies;
	}

	public void setNumOfCopies(int numOfCopies) {
		this.numOfCopies = numOfCopies;
	}

	public void display() {
		System.out.println(bookTitle+" - "+author+" - "+ISBN+" - "+numOfCopies);
	}
	
}
