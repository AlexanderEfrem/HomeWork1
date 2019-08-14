package by.AlexanderEfremenko.HomeWork01.Cycles;

import java.util.Scanner;

public class Task25 {

	public static void main(String[] args) {

		Scanner sa = new Scanner(System.in);

		int sum = 0;
		int x;
		double y = 1;
		double n = 0;

		int a;
		System.out.println("Vvedite chislo a ");
		while (sa.hasNextInt() == false) {
			sa.next();
			System.out.println("Vvedite chislo a ");
		}
		a = sa.nextInt();

		while (a > 0) {
			x = a--;
			y = x * y;

		}

		System.out.println("Factorial vvedennogo chisla = " + y);

	}

}