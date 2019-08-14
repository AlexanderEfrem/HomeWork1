package by.AlexanderEfremenko.HomeWork01.If;

import java.util.Scanner;

public class Task25 {

	public static void main(String[] args) {

		Scanner sx = new Scanner(System.in);

		int x;
		System.out.println("Enter temperature \n");
		while ((sx.hasNextInt() == false)) {
			sx.next();
			System.out.print("Enter temperature \n");
		}
		x = sx.nextInt();

		while (x <= 60) {
			System.out.println("Enter temperature\n");
			while (sx.hasNextInt() == false) {
				sx.next();
				System.out.println("Enter temperature\n");
			}
			x = sx.nextInt();
		}

		while (x > 60) {
			System.out.println("Fire situation\n");

		}

	}

}
