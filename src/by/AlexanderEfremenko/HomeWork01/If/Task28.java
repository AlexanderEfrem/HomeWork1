package by.AlexanderEfremenko.HomeWork01.If;

import java.util.Scanner;

public class Task28 {

	public static void main(String[] args) {

		Scanner sa = new Scanner(System.in);
		Scanner sb = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		Scanner sd = new Scanner(System.in);
		int z1 = 0;
		int z2 = 0;
		int z3 = 0;

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

		if (a == c && a == b && a == d) {
			System.out.println("a = d = b = c");
			System.exit(1);
		}

		if (a == d && b == d) {
			System.out.println("a = d = b");
			System.exit(1);
		} else if (b == d && b == c) {
			System.out.println("b = d = c");
			System.exit(1);
		} else if (c == d && c == a) {
			System.out.println("c = d = a");
			System.exit(1);
		}

		if (a == d) {
			System.out.println("a = d");
			System.exit(1);
		} else if (b == d) {
			System.out.println("b = d");
			System.exit(1);
		} else if (c == d) {
			System.out.println("c = d");
			System.exit(1);
		} else {
			z1 = d - a;
			z2 = d - b;
			z3 = d - c;
		}

		if (z1 > z2 && z1 > z3) {
			System.out.println("z1 - maximalnoe (d - a) ");
		} else if (z2 > z1 && z2 > z3) {
			System.out.println("z2 - maximalnoe (d - b) ");
		} else if (z3 > z2 && z3 > z1) {
			System.out.println("z3 - maximalnoe (d - c) ");
		} else {
			System.out.println("Net maximalnogo ");
		}

	}

}