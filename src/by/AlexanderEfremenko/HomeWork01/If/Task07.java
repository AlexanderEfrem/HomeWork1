package by.AlexanderEfremenko.HomeWork01.If;

import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		Scanner sx = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		Scanner sa = new Scanner(System.in);
		Scanner sb = new Scanner(System.in);
		int y;

		int c;
		System.out.print("Vvedite chislo c ");
		while (sc.hasNextInt() == false) {
			sc.next();
			System.out.print("Vvedite chislo c ");
		}
		c = sc.nextInt();

		int x;
		System.out.print("Vvedite chislo x ");
		while (sx.hasNextInt() == false) {
			sx.next();
			System.out.print("Vvedite chislo x ");
		}
		x = sx.nextInt();

		int b;
		System.out.print("Vvedite chislo b ");
		while (sb.hasNextInt() == false) {
			sb.next();
			System.out.print("Vvedite chislo b ");
		}
		b = sb.nextInt();

		int a;
		System.out.print("Vvedite chislo a ");
		while (sa.hasNextInt() == false) {
			sc.next();
			System.out.print("Vvedite chislo a ");
		}
		a = sa.nextInt();

		if (a * x * x + b * x + c < 1) {
			y = (a * x * x + b * x + c) * (-1);
			System.out.println("y = " + y);
		} else {
			System.out.println("y = " + (a * x * x + b * x + c));
		}

	}

}