package by.AlexanderEfremenko.HomeWork01.If;

import java.util.Scanner;

public class Task24 {

	public static void main(String[] args) {

		Scanner sx = new Scanner(System.in);

		int x;
		System.out.println("Enter number of petals");
		while (sx.hasNextInt() == false) {
			sx.next();
			System.out.println("Enter number of petals");
		}
		x = sx.nextInt();

		if (x % 2 == 0) {
			System.out.println("Sorry, but she doesn't love you :(");
		} else {
			System.out.println("Sorry, but I think she should love java, instead of you");
		}

	}

}
