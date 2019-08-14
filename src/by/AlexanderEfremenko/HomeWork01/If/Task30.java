package by.AlexanderEfremenko.HomeWork01.If;

import java.util.Scanner;

public class Task30 {

	public static void main(String[] args) {

		Scanner sa = new Scanner(System.in);
		Scanner sb = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);

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

		if (a > b && b > c) {
			a = a * 2;
			b = b * 2;
			c = c * 2;
			System.out.println("Ydvoennue chisla: " + "\na = " + a + "\nb = " + b + "\nc = " + c);
		} else {
			a = Math.abs(a);
			b = Math.abs(b);
			c = Math.abs(c);
			System.out.println("Absolute values: " + "\na = " + a + "\nb = " + b + "\nc = " + c);
		}

	}

}