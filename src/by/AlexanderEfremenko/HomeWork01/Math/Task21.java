package by.AlexanderEfremenko.HomeWork01.Math;

public class Task21 {
	public static void main(String[] args) {
		double r;
		double x;
		int dz;
		double mul;

		r = 123.548;
		dz = 3;
		x = (r % 1 * 1000) + (r / 1000);
		mul = Math.pow(10, dz);

		System.out.println("Result r = " + r);
		
		System.out.println("Result r perevernutoe = " + ((long) (x * mul)) / mul);
	}

}
