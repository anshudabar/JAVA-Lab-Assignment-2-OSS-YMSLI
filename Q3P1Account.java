package Assignment2;

public class Q3P1Account {
	private String memberName,accountNumber;
	private double accountBalance;
	
	
	
	public Q3P1Account() {

	}

	public Q3P1Account(String memberName, double accountBalance) {
		this.accountNumber = 10000 + (int)Math.random()*89999 + "";
		this.memberName = memberName;
		this.accountBalance = accountBalance;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}	
	
	public void deposit(double money) {
		this.accountBalance+=money;
	}
	
}
