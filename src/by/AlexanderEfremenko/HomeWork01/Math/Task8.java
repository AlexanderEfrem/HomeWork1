package by.AlexanderEfremenko.HomeWork01.Math;

public class Task8 {
	public static void main(String[] args) {

		double b;
		double a;
		double c;
		double s;

		b = 6;
		a = 3;
		c = 4;

		s = ((b + Math.sqrt(b * b + 4 * a * c)) / (2 * a)) - Math.pow(a, 3) * c + Math.pow(b, -2);

		System.out.println("Result S = " + s);

	}

}