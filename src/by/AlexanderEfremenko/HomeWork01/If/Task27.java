package by.AlexanderEfremenko.HomeWork01.If;

import java.util.Scanner;

public class Task27 {

	public static void main(String[] args) {

		Scanner sa = new Scanner(System.in);
		Scanner sb = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		Scanner sd = new Scanner(System.in);

		int a;
		System.out.println("Vvedite chislo 1 ");
		while (sa.hasNextInt() == false) {
			sa.next();
			System.out.println("Vvedite chislo 1 ");
		}
		a = sa.nextInt();

		int b;
		System.out.println("VVvedite chislo 2 ");
		while (sb.hasNextInt() == false) {
			sb.next();
			System.out.println("Vvedite chislo 2 ");
		}
		b = sb.nextInt();

		int c;
		System.out.println("Vvedite chislo 3 ");
		while (sc.hasNextInt() == false) {
			sc.next();
			System.out.println("Vvedite chislo 3 ");
		}
		c = sc.nextInt();

		int d;
		System.out.println("Vvedite chislo 4 ");
		while (sd.hasNextInt() == false) {
			sc.next();
			System.out.println("Vvedite chislo 4 ");
		}
		d = sd.nextInt();

		if (a == b || c == d) {
			System.out.println("Sorry, but I will not do it");
			System.exit(1);
		}

		System.out.println("Reslut Max value is " + Math.max(Math.min(a, b), Math.min(c, d)));

	}

}