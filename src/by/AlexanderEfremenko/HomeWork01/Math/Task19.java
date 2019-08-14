package by.AlexanderEfremenko.HomeWork01.Math;

public class Task19 {
	public static void main(String[] args) {

		double a;
		double s;
		double h;
		double rVpisannou;
		double rOpisannou;

		a = 4;

		s = (Math.pow(a, 2) * Math.sqrt(3)) / 4;
		h = (Math.sqrt(3) / 2) * a;
		rVpisannou = a / ((Math.sqrt(3) * 2));
		rOpisannou = a / Math.sqrt(3);

		System.out.println("Result S = " + s);
		System.out.println("Result h = " + h);
		System.out.println("Result rVpisannou = " + rVpisannou);
		System.out.println("Result rOpisannou = " + rOpisannou);

	}

}