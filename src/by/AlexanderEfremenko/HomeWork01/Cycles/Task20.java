package by.AlexanderEfremenko.HomeWork01.Cycles;

import java.util.Scanner;

public class Task20 {

	public static void main(String[] args) {
		double an;
		int n;
		double x;
		double sum = 0;

		an = 1 / ((3.0 - 2.0) * (3.0 + 1.0));

		double e = 0.24;

		for (n = 1; e <= Math.abs(an); n++) {
			an = 1 / ((3.0 * n - 2.0) * (3.0 * n + 1.0));
			sum = sum + an;

			System.out.println("Result " + sum);

		}

	}

}
