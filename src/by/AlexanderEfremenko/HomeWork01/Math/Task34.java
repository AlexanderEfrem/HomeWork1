package by.AlexanderEfremenko.HomeWork01.Math;

public class Task34 {

	public static void main(String[] args) {
		int ibyte = 999999999;
		int a = 10000;
		int b = 8;

		double KB = ibyte / a;
		double Kb = KB * b;
		double MB = KB / a;
		double Mb = MB * b;
		double GB = MB / a;
		double Gb = GB * b;

		System.out.println("Result kilobyte " + KB + "\nKilobite = " + Kb + "\nMegoobyte = " + MB + "\nMegobite = " + Mb
				+ "\nGigobyte = " + GB + "\nGigobite = " + Gb);
	}

}
