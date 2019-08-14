package by.AlexanderEfremenko.HomeWork01.Cycles;

import java.util.Scanner;

public class Task18 {

	public static void main(String[] args) {
		double an;
		int n;
		double sum = 0;

		an = Math.pow(-1, 0) / 1.0;

		double e = 0.3;

		for (n = 1; e <= Math.abs(an); n++) {
			an = Math.pow(-1, n - 1) / n;
			sum = sum + an;

			System.out.println("Result " + sum);
		}

	}

}
