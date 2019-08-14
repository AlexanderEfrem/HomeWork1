package by.AlexanderEfremenko.HomeWork01.Cycles;

import java.util.Scanner;

public class Task29 {

	public static void main(String[] args) {

		Scanner sa = new Scanner(System.in);
		Scanner sb = new Scanner(System.in);

		int c;
		int n;

		int a;
		System.out.println("Vvedite chislo m ");
		while (sa.hasNextInt() == false) {
			sa.next();
			System.out.println("Vvedite chislo m ");
		}
		a = sa.nextInt();

		int b;
		System.out.println("Vvedite chislo 2 ");
		while (sb.hasNextInt() == false) {
			sb.next();
			System.out.println("Vvedite chislo 2 ");
		}
		b = sb.nextInt();

		while (a > 0) {
			n = a % 10;
			a = a / 10;
			c = b;
			while (c > 0) {
				if (n == c % 10) {
					System.out.println("Result " + n);
				}
				c = c / 10;
			}

		}

	}

}
