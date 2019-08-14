package by.AlexanderEfremenko.HomeWork01.If;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		int b = 3;
		Scanner sc = new Scanner(System.in);

		int x;
		System.out.print("Vvedite chislo ");
		while (sc.hasNextInt() == false) {
			sc.next();
			System.out.print("Vvedite chislo ");
		}
		x = sc.nextInt();

		if (x < b) {
			System.out.println("Yes");
		} else {
			System.out.println("No");

		}

	}

}
