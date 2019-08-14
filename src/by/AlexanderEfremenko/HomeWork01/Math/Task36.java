package by.AlexanderEfremenko.HomeWork01.Math;

public class Task36 {

	public static void main(String[] args) {
		int a = -4251;

		int a1 = a / 1000;
		int a2 = ((a / 100) - (a1 * 10)) * -1;
		int a3 = ((a / 10) - ((a1 * 100) - (a2 * 10))) * (-1);
		int a4 = ((a - ((a1 * 1000) - (a2 * 100) - a3 * 10))) * (-1);

		int a12 = a1 * a2;
		int a34 = a3 * a4;

		double a22 = (double) a12 / a34;

		System.out.println("Result number dividing =  " + a22);

	}

}
