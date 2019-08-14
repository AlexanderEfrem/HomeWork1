package by.AlexanderEfremenko.HomeWork01.If;

import java.util.Scanner;

/////task11
public class Task12 {

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

		if (a < 1) {
			a = (int) Math.pow(a, 4);
		} else {
			a = (int) Math.pow(a, 2);
		}

		if (b < 1) {
			b = (int) Math.pow(b, 4);
		} else {
			b = (int) Math.pow(b, 2);
		}

		if (c < 1) {
			c = (int) Math.pow(c, 4);
		} else {
			c = (int) Math.pow(c, 2);
		}

		System.out.println("Result: \n chislo 1 = " + a + "\n chislo 2 = " + b + "\n chislo 3 = " + c);
	}

}
