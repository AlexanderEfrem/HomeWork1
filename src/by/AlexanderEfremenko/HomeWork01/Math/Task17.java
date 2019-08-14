package by.AlexanderEfremenko.HomeWork01.Math;

public class Task17 {
	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double d;

		a = 3;
		b = 4;

		c = (Math.pow(a, 3) + Math.pow(b, 3)) / 2;
		d = Math.abs(Math.sqrt((Math.pow(a, 3) * Math.pow(b, 3))));

		System.out.println("Result " + c);
		System.out.println("Result " + d);

	}

}
