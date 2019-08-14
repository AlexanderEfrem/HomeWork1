package by.AlexanderEfremenko.HomeWork01.Math;

public class Task22 {
	public static void main(String[] args) {
		int t;
		int h;
		double x;
		double n;
		double b;

		t = 10061;
		h = (t / 60) / 60;
		n = (double) t / 60 / 60 - h;
		x = (int) (n * 60);
		b = Math.round(((n * 60) - x) * 60);

		System.out.println("Result h = " + h + " Hours " + x + " Minutes " + b + " Sec ");

	}

}
