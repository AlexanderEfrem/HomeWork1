package by.AlexanderEfremenko.HomeWork01.Cycles;

import java.util.Scanner;

public class Task19 {

	public static void main(String[] args) {
		double an;
		int n;
		double x;
		double sum = 0;

		an = (1 / 2.0) + (1 / 3.0);

		double e = 0.833;

		for (n = 1; e <= Math.abs(an); n++) {
			an = (1 / Math.pow(2, n)) + (1 / Math.pow(2, n));
			sum = sum + an;
			System.out.println("Result " + sum);

		}

	}

}
