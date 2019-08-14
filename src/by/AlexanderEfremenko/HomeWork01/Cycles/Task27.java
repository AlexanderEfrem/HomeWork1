package by.AlexanderEfremenko.HomeWork01.Cycles;

import java.util.Scanner;

public class Task27 {

	public static void main(String[] args) {

		Scanner sa = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);

		int x;

		int a;
		System.out.println("Vvedite chislo m ");
		while (sa.hasNextInt() == false) {
			sa.next();
			System.out.println("Vvedite chislo m ");
		}
		a = sa.nextInt();

		int n;
		System.out.println("Vvedite chislo n ");
		while (sn.hasNextInt() == false) {
			sn.next();
			System.out.println("Vvedite chislo n ");
		}
		n = sn.nextInt();

		while (a <= n) {

			System.out.print(a + ": ");

			for (x = 2; x <= a - 1; x++) {
				if (a % x == 0) {

					System.out.print(x + "  ");
				}

			}
			
			System.out.println();

			a = a + 1;

		}

	}

}