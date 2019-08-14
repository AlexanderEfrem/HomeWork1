package by.AlexanderEfremenko.HomeWork01.If;

import java.util.Scanner;

public class Task20 {
	public static void main(String args[]) {

		Scanner sa = new Scanner(System.in);
		Scanner sb = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		Scanner sk = new Scanner(System.in);
		int z = 0;

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

		int k;
		System.out.println("Vvedite chislo k ");
		while (sk.hasNextInt() == false) {
			sk.next();
			System.out.println("Vvedite chislo k ");
		}
		k = sk.nextInt();

		if (a % k == 0) {
			System.out.println("Chislo k delitel chisla 1");
		} else {
			z = z + 1;
		}

		if (a % k == 0) {
			System.out.println("Chislo k delitel chisla 2");
		} else {
			z = z + 1;
		}
		if (a % k == 0) {
			System.out.println("Chislo k delitel chisla 3");
		} else {
			z = z + 1;
		}

		if (z == 3) {
			System.out.println("Chislo k ne delitel chisel a,b,c");
		}

	}

}
