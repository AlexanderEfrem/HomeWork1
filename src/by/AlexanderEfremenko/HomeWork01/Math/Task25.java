package by.AlexanderEfremenko.HomeWork01.Math;

public class Task25 {
	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double x1;
		double x2;

		a = 3;
		b = 5;
		c = 2;

		x1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
		x2 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);

		System.out.println("Result x1 = " + x1 + " Result x2 = " + x2);

	}

}
