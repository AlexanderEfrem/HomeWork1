package by.AlexanderEfremenko.HomeWork01.Cycles;

import java.util.Scanner;

public class Task39 {

	public static void main(String[] args) {

		Scanner sa = new Scanner(System.in);

		int x;
		double n = 0;
		double z;
		double y;

		for (x = 100; x < 1000; x++) {
			n = x;
			z = n / 100;
			y = (z - (int) z) * 100;
			if ((y * 7) == x) {
				System.out.println("Ushodnoe chislo " + y * 7);
			}

		}

	}

}
