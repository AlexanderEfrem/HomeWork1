package by.AlexanderEfremenko.HomeWork01.Math;

public class Task35 {

	public static void main(String[] args) {

		double h;
		int g;
		double c;
		int m = 1335451;
		int n = 6;
		int max = 9;
		int min = 0;
		int p = 10;
		int y;

		h = (double) m / n;
		g = m / n;
		c = h - g;
		System.out.println("re" + g);

		for (g = m / n; g > 0; g = g / p) {
			p = p * 10;
		}
		System.out.println("\n p = " + p);

		y = (int) (h / p);
		System.out.println("hidsfsdfdsf " + y);

		for (h = m / n; h > 0; g = (int) h / p) {
			System.out.println("hi " + g);
		}

		System.out.println("Max digit is " + c + ", min digit is " + g + "ff " + p);

	}

}
