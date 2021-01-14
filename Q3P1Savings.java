package Assignment2;

public class Q3P1Savings extends Q3P1Account {
	private int interest = 5;
	private int MaxWithdrawLimit = 50000;
	private int minBalance = 10000;
	
	public Q3P1Savings() {

	}
	
	public Q3P1Savings(String memberName, double accountBalance) {
		super(memberName, accountBalance);
	}
	
	public double getBalance() {
		double currBalance = this.getAccountBalance();
		currBalance+=currBalance*(this.interest)*(0.01);
		return currBalance;
	}
	
	public double withdraw(double amount) {
		double currBalance = this.getAccountBalance();
		if(amount > this.MaxWithdrawLimit) {
			System.out.println("Withdrawable limit exceeded. Please enter less value ");
			return -1;
		}
		double tempBalance = currBalance - amount;
	    if(tempBalance < this.minBalance) {
			System.out.println("Minimum balance cannot be less than 10,000. Please enter less value");
		    return -1;
		}
		else {
			this.setAccountBalance(tempBalance);
		}
	    return this.getAccountBalance();
	}
	
}
