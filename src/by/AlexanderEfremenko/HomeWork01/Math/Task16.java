package by.AlexanderEfremenko.HomeWork01.Math;

public class Task16 {
	public static void main(String[] args) {
		int d;
		int c;
		int b;
		int a;
		int x;

		x = 9674;

		a = x / 1000;
		b = (x % 1000) / 100;
		c = (x % 100) / 10;
		d = (x % 10);
		x = a * b * c * d;

		System.out.print("Result " + x);

	}

}
