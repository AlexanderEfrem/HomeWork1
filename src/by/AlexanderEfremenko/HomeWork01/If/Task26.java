package by.AlexanderEfremenko.HomeWork01.If;

import java.util.Scanner;

public class Task26 {

	public static void main(String[] args) {

		Scanner sa = new Scanner(System.in);
		Scanner sb = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int z = 0;
		int z1 = 0;
		int z2 = 0;

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

		if (a < b && a < c) {
			System.out.println("a samoe malenkoe chislo ");
			z = a;
		} else if (b < c && b < a) {
			System.out.println("b samoe malenkoe chislo ");
			z = b;
		} else if (c < b && c < a) {
			System.out.println("c samoe malenkoe chislo ");
			z = c;
		} else {
			System.out.println("Net naumenshego chisla");
			System.exit(1);

		}

		if (a > b && a > c) {
			System.out.println("a samoe bolshoe chislo ");
			z1 = a;
		} else if (b > c && b > a) {
			System.out.println("b samoe bolshoe chislo ");
			z1 = b;
		} else if (c > b && c > a) {
			System.out.println("c samoe bolshoe chislo ");
			z1 = c;
		} else {
			System.out.println("Net naubolshego chisla");
			System.exit(1);
		}

		z2 = z1 + z;
		System.out.println("Summa naubolshego u naumenshego chisel = " + z2);

	}

}
