package by.AlexanderEfremenko.HomeWork01.Math;

public class Task29 {
	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double d;
		double e;
		double f;

		a = 3;
		b = 4;
		c = 5;

		d = Math.acos((Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2)) / (2 * a * c));
		e = Math.acos((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b));
		f = Math.acos((Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / (2 * c * b));

		System.out.println("Result anglе in radians A = " + d + " \nResult anglе in radians B = " + e
				+ " \nResult anglе in radians C = " + f + " \nResult angle A = " + Math.toDegrees(d)
				+ " \nResult angle B = " + Math.toDegrees(e) + " \nResult angle C = " + Math.toDegrees(f));
	}

}
