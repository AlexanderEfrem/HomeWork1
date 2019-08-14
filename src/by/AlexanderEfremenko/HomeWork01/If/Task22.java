package by.AlexanderEfremenko.HomeWork01.If;

import java.util.Scanner;

public class Task22 {

	public static void main(String[] args) {

		Scanner sx = new Scanner(System.in);
		Scanner sy = new Scanner(System.in);
		int z = 0;
		int z1 = 0;

		int x;
		System.out.println("Vvedite chislo x ");
		while (sx.hasNextInt() == false) {
			sx.next();
			System.out.print("Vvedite chislo x ");
		}
		x = sx.nextInt();

		int y;
		System.out.println("Vvedite chislo y ");
		while (sy.hasNextInt() == false) {
			sy.next();
			System.out.print("Vvedite chislo y ");
		}
		y = sy.nextInt();

		if (x < y) {
			z = x;
			z1 = y;
			y = x;
			x = z1;
		}

		System.out.println("x = " + x + "\ny = " + y);

	}

}
