package Task_2;

import java.util.Scanner;

public class Word_Counter {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter any text...");
		String userInput = sc.nextLine();
		String split[] = userInput.split(" ");
		int countWords = 0;
		int uniqueWords = 0;
		for (int i = 0; i < split.length; i++) {
			countWords++;
			for (int j = 0; j < split.length; j++) {
				if (i > j && split[i].equals(split[j])) {
					break;
				} else if (split[i].equals(split[j])) {
					uniqueWords++;
					break;
				}
			}
		}
		System.out.println("Total count of words entered by the user : " + countWords);
		System.out.println("Unique words present in the user input : " + uniqueWords);
		sc.close();

	}

}