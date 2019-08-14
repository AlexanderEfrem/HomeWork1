package by.AlexanderEfremenko.HomeWork01.Cycles;

import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {

		Scanner sa = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);

		int a;
		System.out.println("Vvedite chislo a ");
		while (sa.hasNextInt() == false) {
			sa.next();
			System.out.print("Vvedite chislo a ");
		}
		a = sa.nextInt();

		int n;
		System.out.println("Vvedite chislo n ");
		while (sn.hasNextInt() == false) {
			sn.next();
			System.out.print("Vvedite chislo n  ");
		}
		n = sn.nextInt();

		int p;
		p = 1;
		int i;

		for (i = 1; i < n; i++) {
			p = a * (a + i);

			System.out.print("Result " + p + "\n");
		}

	}

}
