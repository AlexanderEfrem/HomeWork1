package by.AlexanderEfremenko.HomeWork01.If;

import java.util.Scanner;

public class Task18 {

	public static void main(String[] args) {

		Scanner sa = new Scanner(System.in);
		Scanner sb = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
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

		if (a < 0) {
			z = z + 1;
		}

		if (b < 0) {
			z = z + 1;
		}

		if (c < 0) {
			z = z + 1;
		}

		System.out.println("Kol-vo otricatelnuh chisel  =  " + z);

	}

}
