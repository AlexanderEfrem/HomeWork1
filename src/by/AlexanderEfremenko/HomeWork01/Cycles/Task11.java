package by.AlexanderEfremenko.HomeWork01.Cycles;

public class Task11 {

	public static void main(String[] args) {

		int x;
		int paznost = 0;

		for (x = 1; x < 201; x++) {
			int c = x * x * x;
			paznost = c - paznost;
			System.out.println("Result " + paznost);
		}

	}

}
