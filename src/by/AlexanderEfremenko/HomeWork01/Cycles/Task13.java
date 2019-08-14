package by.AlexanderEfremenko.HomeWork01.Cycles;

public class Task13 {

	public static void main(String[] args) {

		double x;
		double y;

		x = -5;

		while (x <= 5) {
			y = (5 - (Math.pow(x, 2) / 2));
			x = x + 0.5;
			System.out.println("Result y = " + y + "\n x = " + x);
		}

	}

}
