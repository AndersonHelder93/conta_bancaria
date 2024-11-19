package entities;

public class Dates {
	
	private int number;
	private String holder;
	private double balance;
	

	public Dates(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	
	public Dates(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		depositValue(initialDeposit);
	}
	
	public int getNumber() {
		return number;
	}
	
	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double depositValue(double amount) {
		return balance += amount;
	}

	public double withdrawValue(double amount) {
		if (amount != 0) {
			balance-= amount + 5.0;
		}
		 return balance;
	}
	
	public String toString() {
		return "Account "
				+ number
				+ ", Holder: "
				+ holder
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}
}
