package by.AlexanderEfremenko.HomeWork01.If;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		Scanner sx = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);

		int x;
		System.out.print("Vvedite chislo 1 ");
		while (sc.hasNextInt() == false) {
			sc.next();
			System.out.print("Vvedite chislo 1 ");
		}
		x = sc.nextInt();

		int a;
		System.out.print("Vvedite chislo 2 ");
		while (sx.hasNextInt() == false) {
			sx.next();
			System.out.print("Vvedite chislo 2 ");
		}
		a = sx.nextInt();

		if (x > a) {
			System.out.println("The smallest = " + a);
		} else {
			System.out.println("The smallest = " + x);

		}

	}

}
