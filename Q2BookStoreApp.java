package Assignment2;

import java.util.Scanner;

public class Q2BookStoreApp {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		Q2Book book[] = new Q2Book[10];
		

		// Adding books to Book array
		book[0]= new Q2Book("The jungle book","Auth1","123",10);
		book[1]= new Q2Book("Rich dad poor dad","Auth2","133",13);
		book[2]= new Q2Book("Harry Potter","Auth3","1223",12);
		book[3]= new Q2Book("Tales of narnia","Auth4","3123",8);
		book[4]= new Q2Book("How to do business","Auth5","1233",7);
		book[5]= new Q2Book("Rules of life","Auth6","9123",2);
		book[6]= new Q2Book("Geaography of world","Auth7","723",25);
		book[7]= new Q2Book("History of India","Auth8","789",18);
		book[8]= new Q2Book("Bigbang Science","Auth9","1025",19);
		book[9]= new Q2Book("Quantum Mechanics","Auth10","1876",4);
		
		
		
		Q2BookStore database = new Q2BookStore(book);
		int userInput;
		while(true) {
			System.out.println("Please enter your choice: ");
			System.out.println("Enter 1 to display available books ");
			System.out.println("Enter 2 to order new books");
			System.out.println("Enter 3 to sell books");
			System.out.println("Enter 0 to exit");
			
			userInput=obj.nextInt();
			
			if(userInput == 1) {
				database.display();
			}
			
			else if(userInput == 2) {
				System.out.println("Please enter the book ISBN to order: ");
				String bookISBN = obj.nextLine();
				System.out.println("Please enter the quantity to order: ");
				int quant = obj.nextInt();
				database.order(bookISBN,quant);
			}
			
			else if(userInput == 3) {
				System.out.println("Please enter the book name to sell: ");
				String bookName = obj.nextLine();
				System.out.println("Please enter the quantity to sell: ");
				int quant = obj.nextInt();				
				database.sell(bookName,quant);
			}
			
			else if(userInput == 0) {
				System.exit(0);
			}
			
			else {
				System.out.println("Pleae enter a valid input");
			}
			obj.nextLine();
			System.out.println("Do you wish to proceed? ");
			String response = obj.nextLine();
			
			if(response == "YES") {
				continue;
			}
			else {
				break;
			}
			
		}
		obj.close();
		
	}
		
}
