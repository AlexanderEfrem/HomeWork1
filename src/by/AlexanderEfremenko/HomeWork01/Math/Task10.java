package by.AlexanderEfremenko.HomeWork01.Math;

public class Task10 {
	public static void main(String[] args) {
		double x;
		double y;
		double s;

		x = 2;
		y = 3;

		s = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);

		System.out.println("Result S = " + s);
	}

}
