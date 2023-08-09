package Task_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Number_Game {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int minimumNumber = 1;
		int maximumNumber = 100;
		performTask(minimumNumber, maximumNumber);
	}

	public static void performTask(int minimumNumber, int maximumNumber) {
		int totalAttempts = 0;
		int roundsWin = 0;
		int guessAgain = 1;
		try {
			while (guessAgain == 1) {
				int randomNumber = (int) Math
						.floor(Math.random() * (maximumNumber - minimumNumber + 1) + minimumNumber);
				System.out.println("Please enter your number for guess the generate number : ");
				int userGuessNumber = sc.nextInt();
				boolean userGuess = false;
				int maxAttempts = 0;
				while (maxAttempts < 10) {
					if (userGuessNumber == randomNumber) {
						System.out.println("Your guess is correct..");
						roundsWin++;
						userGuess = true;
						break;
					} else if (userGuessNumber < 50) {
						System.out.println("Your guess number is too low...");
					} else if (userGuessNumber <= 150 && userGuessNumber >= 50) {
						System.out.println("Your guess number is near to generated number...");
					} else if (userGuessNumber > 150) {
						System.out.println("Your guess number is too High...");
					}
					if (maxAttempts < 9) {
						System.out.println("Please Re-Enter your number for guess the generate number : ");
						userGuessNumber = sc.nextInt();
					}
					maxAttempts++;
				}
				if (!userGuess) {
					System.out.println("You have exceeded maximum number of guess attempts.. The correct number was : "
							+ randomNumber);
				}
				System.out.println("Do you want to guess again.. Enter 1..or To exit enter any number..");
				guessAgain = sc.nextInt();
				totalAttempts += maxAttempts;
				if (guessAgain != 1) {
					break;
				}
				
			}
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("You entered invalid input..");
		}
			System.out.println("Your score is :");
			System.out.println("Rounds won: " + roundsWin);
			System.out.println("Total attempts: " + totalAttempts);
			sc.close();
	}

}
