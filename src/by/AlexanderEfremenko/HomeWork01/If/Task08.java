package by.AlexanderEfremenko.HomeWork01.If;

import java.util.Scanner;

public class Task08 {

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

		if (Math.pow(x, 2) > Math.pow(a, 2)) {
			System.out.println("Number one bigger and = " + Math.pow(x, 2));
		} else {
			System.out.println("Number 2 bigger and = " + Math.pow(a, 2));

		}

	}

}
