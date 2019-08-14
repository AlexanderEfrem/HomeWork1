package by.AlexanderEfremenko.HomeWork01.Math;

public class Task28 {
	public static void main(String[] args) {
		double rad;
		double grad;

		rad = 1.047201;

		grad = rad * (180 / Math.PI);

		System.out.println("Result grad = " + grad + " Result Minutes " + (int) (grad * 60) + " Result Seconds "
				+ (int) (((grad * 60) * 60)));

	}

}
