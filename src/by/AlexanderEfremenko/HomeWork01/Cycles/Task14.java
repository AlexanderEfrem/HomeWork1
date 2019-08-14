package by.AlexanderEfremenko.HomeWork01.Cycles;

import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int b = 1;
		double c;
		int z = 1;

		int n;
		System.out.println("Enter value \n");
		while ((sc.hasNextInt() == false)) {
			sc.next();
			System.out.print("Enter value \n");
		}
		n = sc.nextInt();

		for (c = 1; z < n + 1; c = (double) 1 / b) {
			b++;
			z++;
			System.out.println("Result " + c);
		}

	}

}
