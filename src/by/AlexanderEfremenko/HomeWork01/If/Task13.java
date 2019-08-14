package by.AlexanderEfremenko.HomeWork01.If;

import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {

		Scanner sx1 = new Scanner(System.in);
		Scanner sy1 = new Scanner(System.in);
		Scanner sx2 = new Scanner(System.in);
		Scanner sy2 = new Scanner(System.in);
		double xy1;
		double xy2;

		int x1;
		System.out.println("Vvedite coordinaty x1 ");
		while (sx1.hasNextInt() == false) {
			sx1.next();
			System.out.print("Vvedite coordinaty x1 ");
		}
		x1 = sx1.nextInt();

		int y1;
		System.out.println("Vvedite coordinaty y1 ");
		while (sy1.hasNextInt() == false) {
			sy1.next();
			System.out.print("Vvedite coordinaty y1 ");
		}
		y1 = sy1.nextInt();

		int x2;
		System.out.println("Vvedite coordinaty x2 ");
		while (sx2.hasNextInt() == false) {
			sx2.next();
			System.out.print("Vvedite coordinaty x2 ");
		}
		x2 = sx2.nextInt();

		int y2;
		System.out.println("Vvedite coordinaty y2 ");
		while (sy2.hasNextInt() == false) {
			sy2.next();
			System.out.print("Vvedite coordinaty y2 ");
		}
		y2 = sy2.nextInt();

		xy1 = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
		xy2 = Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2));

		if (xy1 < xy2) {
			System.out.print("Tocha 1 blize k nachaly coordinat");
		} else {
			System.out.print("Tocha 2 blize k nachaly coordinat");
		}

	}

}
