package by.AlexanderEfremenko.HomeWork01.If;

import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {
		Scanner sa = new Scanner(System.in);
		Scanner sb = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);

		int a;
		System.out.print("Vvedite chislo a ");
		while (sa.hasNextInt() == false) {
			sa.next();
			System.out.print("Vvedite chislo a ");
		}
		a = sa.nextInt();

		int b;
		System.out.print("Vvedite chislo b ");
		while (sb.hasNextInt() == false) {
			sb.next();
			System.out.print("Vvedite chislo b ");
		}
		b = sb.nextInt();

		int c;
		System.out.print("Vvedite chislo c ");
		while (sc.hasNextInt() == false) {
			sc.next();
			System.out.print("Vvedite chislo c ");
		}
		c = sc.nextInt();

		if (c == b) {
			System.out.println("isosceles triangle");

		} else if (a == c) {
			System.out.println("isosceles triangle");

		} else if (a == b) {
			System.out.println("isosceles triangle");

		} else {
			System.out.println("triangle unisosceles");

		}

	}

}