package by.AlexanderEfremenko.HomeWork01.Math;

public class Task13 {
	public static void main(String[] args) {
		double x1;
		double x2;
		double y1;
		double y2;
		double x3;
		double y3;
		double s;
		double p;

		x1 = 2;
		x2 = -3;
		x3 = 4;
		y1 = 5;
		y2 = 6;
		y3 = 7;

		s = Math.abs((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1)) / 2;
		p = (Math.sqrt((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2))))
				+ (Math.sqrt((Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2))))
				+ (Math.sqrt((Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2))));

		System.out.println("Result s = " + s);
		System.out.println("Result p = " + p);

	}

}
