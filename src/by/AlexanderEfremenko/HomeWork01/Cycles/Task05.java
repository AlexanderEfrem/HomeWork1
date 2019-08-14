package by.AlexanderEfremenko.HomeWork01.Cycles;

public class Task05 {

	public static void main(String[] args) {

		int i = 0;
		int x = 0;

		while (i < 100) {
			i++;
			if (i % 2 != 0) {
				x = x + i;
				System.out.println(x);
			}

		}

	}

}
