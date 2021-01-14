package Assignment2;

public class Q3P1Current extends Q3P1Account {
	private int TradeLicenseNumber;

	public Q3P1Current() {

	}

	public Q3P1Current(String memberName, double accountBalance, int tradeLicenseNumber) {
		super(memberName, accountBalance);
		TradeLicenseNumber = tradeLicenseNumber;
	}
	
	public int getTradeLicenseNumber() {
		return TradeLicenseNumber;
	}

	public void setTradeLicenseNumber(int tradeLicenseNumber) {
		TradeLicenseNumber = tradeLicenseNumber;
	}
	
	public double getBalance() {
		return this.getAccountBalance();
	}	

	public void withdraw(double money) {
		if(this.getAccountBalance()<money) {
			System.out.println("Not enough balance");
		}
		else {
			this.setAccountBalance(this.getAccountBalance()-money);
		}
	}
	
}
