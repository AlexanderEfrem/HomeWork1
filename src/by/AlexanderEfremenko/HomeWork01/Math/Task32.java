package by.AlexanderEfremenko.HomeWork01.Math;

public class Task32 {

	public static void main(String[] args) {
		// значения времени 1
		int h = 15;
		int m = 45;
		int c = 25;
		// значения времени 2
		int p = 2;
		int k = 34;
		int q = 28;
		// значения времени в секунды
		int a1 = (h * 60 * 60) + (m * 60) + c;
		int a2 = (p * 60 * 60) + (k * 60) + q;
		// сумма времени
		int a3 = a1 + a2;
		// перевод времени обранто в часы и минуты
		int h2 = (a3 / 60) / 60;
		double n = (double) a3 / 60 / 60 - h2;
		double x = (int) (n * 60);
		double b = Math.round(((n * 60) - x) * 60);

		System.out.println("Result h = " + h2 + " Hours " + x + " Minutes " + b + " Sec");
		
	}
	
}
