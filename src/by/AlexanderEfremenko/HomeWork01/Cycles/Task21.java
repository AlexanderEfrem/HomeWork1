package by.AlexanderEfremenko.HomeWork01.Cycles;

import java.util.Scanner;

public class Task21 {

	public static void main(String[] args) {

		Scanner sa = new Scanner(System.in);
		Scanner sb = new Scanner(System.in);
		Scanner sh = new Scanner(System.in);

		double fx;
		double x;

		int a;
		System.out.println("Vvedite chislo a ");
		while (sa.hasNextInt() == false) {
			sa.next();
			System.out.println("Vvedite chislo a ");
		}
		a = sa.nextInt();

		int b;
		System.out.println("VVvedite chislo b ");
		while (sb.hasNextInt() == false) {
			sb.next();
			System.out.println("Vvedite chislo b ");
		}
		b = sb.nextInt();

		int h;
		System.out.println("Vvedite chislo h ");
		while (sh.hasNextInt() == false) {
			sh.next();
			System.out.println("Vvedite chislo h ");
		}
		h = sh.nextInt();

		System.out.println("x\tf(x)\n");

		for (int i = a; i <= b; i = i + h) {

			x = i;

			fx = -Math.sin(x * 2);

			System.out.println(i + "\t" + fx);

		}

	}

}
