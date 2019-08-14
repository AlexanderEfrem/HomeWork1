package by.AlexanderEfremenko.HomeWork01.Cycles;

public class Task34 {

	public static void main(String[] args) {

		int x;
		int a = 0;
		int c = 0;
		int d = 0;
		int b = 0;
		int sum = 0;

		for (x = 1000; x < 10000; x++) {

			a = x % 10;
			c = (x / 10) % 10;
			d = (x / 100) % 10;
			b = x / 1000;

			sum = a + b + c + d;

			if (sum == 15) {

				System.out.println(x);

			}

		}

	}

}
