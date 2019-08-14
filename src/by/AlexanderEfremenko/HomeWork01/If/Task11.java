package by.AlexanderEfremenko.HomeWork01.If;

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {

		Scanner sa = new Scanner(System.in);
		Scanner sb = new Scanner(System.in);
		Scanner sh1 = new Scanner(System.in);
		Scanner sh2 = new Scanner(System.in);

		int a;
		System.out.println("Vvedite osnovanue treugolnika1 ");
		while (sa.hasNextInt() == false) {
			sa.next();
			System.out.print("Vvedite osnovanue treugolnika1 ");
		}
		a = sa.nextInt();

		int b;
		System.out.println("Vvedite osnovanue treugolnika2 ");
		while (sb.hasNextInt() == false) {
			sb.next();
			System.out.print("Vvedite osnovanue treugolnika2 ");
		}
		b = sb.nextInt();

		int h1;
		System.out.println("Vvedite vusoty treugolnika1 ");
		while (sh1.hasNextInt() == false) {
			sh1.next();
			System.out.print("Vvedite vusoty treugolnika1 ");
		}
		h1 = sh1.nextInt();

		int h2;
		System.out.println("Vvedite vusoty treugolnika2 ");
		while (sh2.hasNextInt() == false) {
			sh2.next();
			System.out.print("Vvedite vusoty treugolnika2 ");
		}
		h2 = sh2.nextInt();

		double y = (0.5 * a * h1);
		double x = (0.5 * b * h2);

		if (y > x) {
			System.out.println("S treugolnika 1 bolshe u ravno  " + y);
		} else {
			System.out.println("S treugolnika 2 bolshe u ravno" + x);

		}

	}

}
