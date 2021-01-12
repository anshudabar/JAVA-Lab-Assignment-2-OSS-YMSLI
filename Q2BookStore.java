package Assignment2;

public class Q2BookStore {
	public Q2Book[] books;
	
	public Q2BookStore() {
		
	}
	public Q2BookStore(Q2Book[] book) {
		this.books=new Q2Book[book.length];
		for(int i=0;i<book.length;i++) {
			this.books[i]=book[i];
		}
	}

	void sell(String bookTitle, int noOfCopies) {
		int flag = 0;
		for(int i=0;i<books.length;i++) {
			if(books[i].getBookTitle() == bookTitle) {
				books[i].setNumOfCopies(books[i].getNumOfCopies()-noOfCopies);
				flag=1;
				break;
			}
		}
		if(flag == 0)
			System.out.println("Book not found..!!!");
	}
	
	void order(String iSBN, int noOfCopies) {
		int flag = 0;
		for(int i=0;i<books.length;i++) {
			if(iSBN.equals(books[i].getISBN())) {
				books[i].setNumOfCopies(books[i].getNumOfCopies()+noOfCopies);
				flag = 1;
				break;
			}
		}
		if(flag == 0) {
			System.out.println("Book not found in the database. Please add if available");
		}
	}
	
	void display() {
		for(int i=0; i<books.length;i++) {
			System.out.println(books[i].getBookTitle()+" - "+books[i].getAuthor()+" - "+books[i].getISBN()+" - "+books[i].getNumOfCopies());
			
		}
	}
	
}
