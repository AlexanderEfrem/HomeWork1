package by.AlexanderEfremenko.HomeWork01.Cycles;

import java.util.Scanner;

public class Task33 {

	public static void main(String[] args) {

		Scanner sa = new Scanner(System.in);

		int c;
		int b;
		int g = 0;

		int a;

		a = 1965;

		while (a > 0) {
			c = a % 10;
			a = a / 10;
			g = c;
			if (g > a % 10) {
				a = a / 10;
			} else {
				g = a % 10;

			}

		}

		System.out.println("Result = " + g);

	}

}
