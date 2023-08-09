package Task_4;

public class BankAccount {
	private double balance;

	public BankAccount(double balance) {
		super();
		this.balance = balance;
	}

//Getters and Setters methods..
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

//Validation methods...
	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance = balance - amount;
			System.out.println("You have Successfully Withdrawn your amount..\nUpdated balance are : " + this.balance);
		} else if (amount < 1) {
			System.out.println("Minimum withdrwable amount should be 1 rupee..");
		} else {
			System.out.println("Your withdrwable amount exceeds actuall balance..");
		}
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("You have Successfully Diposited your amount..\nUpdated balance are : " + this.balance);
		} else {
			System.out.println("Minimum Dipositable amount should be 1 rupee..");
		}
	}

}
