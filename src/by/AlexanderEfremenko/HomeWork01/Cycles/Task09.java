package by.AlexanderEfremenko.HomeWork01.Cycles;

public class Task09 {

	public static void main(String[] args) {

		int x;
		int sum = 0;

		for (x = 1; x < 101; x++) {
			int k = x * x;
			sum = sum + k;

			System.out.println("Result " + sum);
		}

	}

}
