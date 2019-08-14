package by.AlexanderEfremenko.HomeWork01.If;

import java.util.Scanner;

public class Task15 {
	public static void main(String[] args) {

		Scanner sx = new Scanner(System.in);
		Scanner sy = new Scanner(System.in);
		double z;
		double z1;

		double x;
		System.out.println("Vvedite chislo x ");
		while (sx.hasNextInt() == false) {
			sx.next();
			System.out.print("Vvedite chislo x ");
		}
		x = sx.nextInt();

		double y;
		System.out.println("Vvedite chislo y ");
		while (sy.hasNextInt() == false) {
			sy.next();
			System.out.print("Vvedite chislo y ");
		}
		y = sy.nextInt();

		if (x < y) {
			z = 0.5 * (x + y);
			z1 = 2 * (x * y);
			x = z;
			y = z1;
		} else {
			z1 = 0.5 * (x + y);
			z = 2 * (x * y);
			y = z1;
			x = z;
		}

		System.out.print("chislo x " + x + "\nchislo y " + y);
	}

}
