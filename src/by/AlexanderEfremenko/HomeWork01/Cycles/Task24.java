package by.AlexanderEfremenko.HomeWork01.Cycles;

import java.util.Scanner;

public class Task24 {

	public static void main(String[] args) {

		Scanner sa = new Scanner(System.in);

		int sum = 0;
		int x;
		double y = 0;
		double n = 0;

		int a;
		System.out.println("Vvedite chislo a ");
		while (sa.hasNextInt() == false) {
			sa.next();
			System.out.println("Vvedite chislo a ");
		}
		a = sa.nextInt();

		x = a;

		while (a > 0) {
			if ((a % 10) % 2 == 0) {
				sum = sum + a % 10;
			}
			a = a / 10;
			System.out.println("sum = " + sum);
		}

		while (x > 0) {
			y = x % 10;
			x = x / 10;
			n = n * 10 + y;
			System.out.println("Chislo = = " + n);

		}
		
	}

}
