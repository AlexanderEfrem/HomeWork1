package by.AlexanderEfremenko.HomeWork01.Cycles;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int b;
		int c = 0;

		int x;
		System.out.println("Enter value \n");
		while ((sc.hasNextInt() == false)) {
			sc.next();
			System.out.print("Enter value \n");
		}
		x = sc.nextInt();

		while (x < 0) {
			System.out.println("Enter value\n");
			while (sc.hasNextInt() == false) {
				sc.next();
				System.out.println("Enter value\n");
			}
			x = sc.nextInt();
		}

		for (b = 1; b < x; b++) {
			c = c + b;
		}

		System.out.println("Result c = " + c);

	}

}
