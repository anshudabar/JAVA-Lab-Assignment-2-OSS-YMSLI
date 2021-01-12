package Assignment2;
import java.util.Scanner;
public class Q3P2Application {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		Q3P2Student student = null;
		System.out.println("Please select the operation -> 1.Create Object   2.Display Object");
		int userInput = obj.nextInt();
		if (userInput == 1) {
			System.out.println("Please provide the type of Input");
			System.out.println("1. Name, ID, Grade");
			System.out.println("2. Name, ID");
			System.out.println("3. ID");
			userInput = obj.nextInt();
			student = new Q3P2Student();
			if (userInput == 1) {
				String name = obj.nextLine();
				String id =obj.nextLine();
				double grade =obj.nextDouble();
				student = new Q3P2Student(name,id,grade);
			}
			else if (userInput == 2) {
				String name = obj.nextLine();
				String id =obj.nextLine();
				student = new Q3P2Student(name,id);
			}
			else if (userInput == 3) {
				String id =obj.nextLine();
				student = new Q3P2Student(id);
			}
			else
			{
				System.out.println("Please enter a valid Input");
			}
		}
		if (userInput == 2) {
			System.out.println("Please provide the type of Display");
			System.out.println("1. Name,ID,Grade,Year");
			System.out.println("2. Name,ID,Grade");
			int input=obj.nextInt();
			if(input==1)
			{
				System.out.println("Please enter the year ");
				int year=obj.nextInt();
				student.display(year);
			}
			else
			{
				student.display();
			}
		}
		obj.close();
	}
}