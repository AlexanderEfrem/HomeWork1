package by.AlexanderEfremenko.HomeWork01.If;

import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {

		Scanner sx1 = new Scanner(System.in);
		Scanner sy1 = new Scanner(System.in);

		int x1;
		System.out.println("Vvedite ygol a ");
		while (sx1.hasNextInt() == false) {
			sx1.next();
			System.out.print("Vvedite ygol a");
		}
		x1 = sx1.nextInt();

		int y1;
		System.out.println("Vvedite ygol b ");
		while (sy1.hasNextInt() == false) {
			sy1.next();
			System.out.print("Vvedite ygol b ");
		}
		y1 = sy1.nextInt();

		if (x1 + y1 >= 180) {
			System.out.println("Treygolnik ne syschestvyet");
		} else if (x1 == 90) {
			System.out.println("Treygolnik prymoygolnu");
		} else if (y1 == 90) {
			System.out.println("Treygolnik prymoygolnu");
		} else if (y1 + x1 == 90) {
			System.out.println("Treygolnik prymoygolnu");
		} else {
			System.out.println("Treygolnik ne prymoygolnu");

		}

	}

}
