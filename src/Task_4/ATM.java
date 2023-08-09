package Task_4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ATM {
	static Scanner sc = new Scanner(System.in);
	static BankAccount account = new BankAccount(1000);
	// Intial balance 1000
	static ATM atm = new ATM();

	public static void main(String[] args) {
		try {
		do {
			System.out.println("Select one from below...\n1.Withdraw\n2.Diposit\n3.Check Balance\n0.exit");
			int option = sc.nextInt();
			switch (option) {
			case 1: {
				atm.withdraw();
				break;
			}
			case 2: {
				atm.diposit();
				break;
			}
			case 3: {
				atm.checkBalance();
				break;
			}
			case 0: {
				System.exit(0);
			}
			default: {
				System.out.println("Choose valid option...");
			}
			}
		}while (true);
		}catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("You have entered invalid data...");
			
		}
	}
	
	public void withdraw() {
		try {
		System.out.println("Enter amount to withdraw : ");
		double withdraw = sc.nextDouble();
		account.withdraw(withdraw);
		}
		catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("You have entered invalid data...");
		}
	}
	
	public void diposit() {
		try {
		System.out.println("Enter amount to diposit : ");
		double diposit = sc.nextDouble();
		account.deposit(diposit);
		}
		catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("You have entered invalid data...");
		}
	}
	public void checkBalance() {
		System.out.println("Current balance : " + account.getBalance());
	}
	

}
