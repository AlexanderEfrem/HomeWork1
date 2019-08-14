package by.AlexanderEfremenko.HomeWork01.If;

import java.util.Scanner;

public interface Task29 {
	public static void main(String[] args) {

		Scanner sx1 = new Scanner(System.in);
		Scanner sy1 = new Scanner(System.in);
		Scanner sx2 = new Scanner(System.in);
		Scanner sy2 = new Scanner(System.in);
		Scanner sx3 = new Scanner(System.in);
		Scanner sy3 = new Scanner(System.in);

		int x1;
		System.out.println("Vvedite x1 ");
		while (sx1.hasNextInt() == false) {
			sx1.next();
			System.out.println("Vvedite x1 ");
		}
		x1 = sx1.nextInt();

		int y1;
		System.out.println("VVvedite y1 ");
		while (sy1.hasNextInt() == false) {
			sy1.next();
			System.out.println("Vvedite y1 ");
		}
		y1 = sy1.nextInt();

		int x2;
		System.out.println("Vvedite x2 ");
		while (sx2.hasNextInt() == false) {
			sx2.next();
			System.out.println("Vvedite x2 ");
		}
		x2 = sx2.nextInt();

		int y2;
		System.out.println("Vvedite y2 ");
		while (sy2.hasNextInt() == false) {
			sy2.next();
			System.out.println("Vvedite y2 ");
		}
		y2 = sy2.nextInt();

		int x3;
		System.out.println("Vvedite x3 ");
		while (sx3.hasNextInt() == false) {
			sx3.next();
			System.out.println("Vvedite x3 ");
		}
		x3 = sx3.nextInt();

		int y3;
		System.out.println("Vvedite y3 ");
		while (sy3.hasNextInt() == false) {
			sy3.next();
			System.out.println("Vvedite y2 ");
		}
		y3 = sy3.nextInt();

		if ((x1 - x2) * (y3 - y2) == (x3 - x2) * (y1 - y2)) {
			System.out.println("Tochki legat na odnou pryamou");
		} else {
			System.out.println("Tochki ne legat na odnou pryamou");
		}

	}

}
