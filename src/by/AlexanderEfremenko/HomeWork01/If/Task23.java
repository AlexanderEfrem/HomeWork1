package by.AlexanderEfremenko.HomeWork01.If;

import java.util.Scanner;

public class Task23 {

	public static void main(String[] args) {

		Scanner sx = new Scanner(System.in);
		Scanner sy = new Scanner(System.in);

		int x;
		System.out.println("Enter date \n");
		while ((sx.hasNextInt() == false)) {
			sx.next();
			System.out.print("Enter date \n");
		}
		x = sx.nextInt();
		while (x > 31 || x < 1) {
			System.out.println("Wrong date \n");
			while (sx.hasNextInt() == false) {
				sx.next();
				System.out.println("Wrong date \n");
			}
			x = sx.nextInt();

		}

		int y;
		System.out.println("Enter month \n");
		while ((sy.hasNextInt() == false)) {
			sy.next();
			System.out.print("Enter month \n");
		}
		y = sx.nextInt();
		while (y > 12 || y < 1) {
			System.out.println("Wrong month \n");
			while (sy.hasNextInt() == false) {
				sy.next();
				System.out.println("Wrong month \n");
			}
			y = sy.nextInt();

		}

		System.out.println("Thanks for entered date" + "\nYour date is " + x + "." + y);

	}
	
}
