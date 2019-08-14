package by.AlexanderEfremenko.HomeWork01.If;

import java.util.Scanner;

public class Task21 {

	private static Scanner reader;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your Sex? Enter M or F\n");

		char c = scanner.next().charAt(0);

		while ((c != 'M') & (c != 'F')) {
			System.out.println("Enter M or F\n");
			c = scanner.next().charAt(0);
		}
		if (c == 'M') {
			System.out.println("I like boys");
		} else if (c == 'F') {
			System.out.println("I like girls");
		}
		
	}
	
}
