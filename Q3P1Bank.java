package Assignment2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3P1Bank {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
		Q3P1Savings savingsAccount= new Q3P1Savings();
		Q3P1Current currentAccount = new Q3P1Current();
		System.out.println("Welcome to the YMSLI Bank");
		System.out.println("What type of Account do you want to create ?");
		System.out.println("1. Savings Account");
		System.out.println("2. Current Account");
		System.out.println("3. Exit");
		int userInput = Integer.parseInt(obj.readLine());
		
		System.out.println("Please enter your name: ");
		String userName = obj.readLine();
		System.out.println("Please enter the initial deposit: ");
		double accountBalance = Double.parseDouble(obj.readLine());
		
		String accountNumber = null,typeOfAccount = null,memberName="user";
		if( userInput == 1) {
			savingsAccount = new Q3P1Savings(userName,accountBalance); 
			typeOfAccount="Savings Account";
			accountNumber = savingsAccount.getAccountNumber();
			memberName=savingsAccount.getMemberName();
			System.out.println("Dear"+memberName+" Thankyou for opening a "+typeOfAccount+" at YMSLI Bank.");
			System.out.println("Your Account number is: "+accountNumber);
		}
		
		else if( userInput == 2) {
			System.out.println("Please enter your Trade License Number to proceed: ");
			int tradeLicenseNumber = Integer.parseInt(obj.readLine());
			currentAccount = new Q3P1Current(userName,accountBalance,tradeLicenseNumber);
			typeOfAccount="Current Account";
			accountNumber = currentAccount.getAccountNumber();
			memberName=currentAccount.getMemberName();
			System.out.println("Dear "+memberName+" Thankyou for opening a "+typeOfAccount+" at YMSLI Bank.");
			System.out.println("Your Account number is: "+accountNumber);
		}
		
		else {
			System.out.println("Dear "+memberName+" Thankyou for Banking with YMSLI Bank, have a good day :)");
			System.exit(0);
		}
		
		while(true) {		
			System.out.println("Please select from the following operations: ");
			System.out.println("1.Deposit Money");
			System.out.println("2.Withdraw Money");
			System.out.println("3.Display Money");
			System.out.println("4.Exit");
			int userResponse = Integer.parseInt(obj.readLine());
			
			if(userResponse == 1) {
				System.out.println("Please enter the amount you wish to deposit: ");
				double amount = Double.parseDouble(obj.readLine());
				double prevBalance=0,upBalance=0;
				if(typeOfAccount == "Savings Account") {
					prevBalance=savingsAccount.getBalance();
					savingsAccount.deposit(amount);
					upBalance=savingsAccount.getBalance();
				}
				else if(typeOfAccount == "Current Account") {
					prevBalance=currentAccount.getAccountBalance();
					currentAccount.deposit(amount);
					upBalance=currentAccount.getBalance();
				}				
				System.out.println("Do you want to see the Balance Status? ");
				System.out.println("1: Yes");
				System.out.println("2. No");
				int val = Integer.parseInt(obj.readLine());
				if(val == 1) {
					System.out.println("Account balance before transaction: "+prevBalance);
					System.out.println("Account balance after transaction: "+upBalance);
				}
			}
			
			else if(userResponse == 2) {
				System.out.println("Please enter the amount you wish to withdraw: ");
				double amount = Double.parseDouble(obj.readLine());
				double prevBalance=0,upBalance=0;
				if(typeOfAccount == "Savings Account") {
					prevBalance=savingsAccount.getBalance();
					double status = savingsAccount.withdraw(amount);
					while(status == -1) {
						double nAmount = Double.parseDouble(obj.readLine());
						status = savingsAccount.withdraw(amount);
					}
					upBalance=savingsAccount.getBalance();
				}
				else if(typeOfAccount == "Current Account") {
					prevBalance=currentAccount.getAccountBalance();
					currentAccount.withdraw(amount);
					upBalance=currentAccount.getBalance();
				}				
				System.out.println("Do you want to see the Balance Status? ");
				System.out.println("1: Yes");
				System.out.println("2. No");
				int val = Integer.parseInt(obj.readLine());
				if(val == 1) {
					System.out.println("Account Number :"+accountNumber);
					System.out.println("Account balance before transaction: "+prevBalance);
					System.out.println("Account balance after transaction: "+upBalance);
				}
			}
			
			else if(userResponse == 3) {
				System.out.println("Account Number :"+accountNumber);
				if(typeOfAccount == "Savings account") {
					System.out.println("Balance Amount: "+savingsAccount.getAccountBalance());
				}
				else {
					System.out.println("Balance Amount: "+currentAccount.getAccountBalance());
				}
			}
			
			else if(userResponse == 4) {
				System.out.println("Dear "+memberName+" Thankyou for banking with YMSLI Bank, have a good day :)");
				break;
			}
			
			else {
				System.out.println("Please enter a valid response.");
				break;
			}
			

		}
		
		
		
	}
}
