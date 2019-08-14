package by.AlexanderEfremenko.HomeWork01.Cycles;

import java.math.BigInteger;

public class Task16 {

	public static void main(String[] args) {
		int x = 1;
		int a = 1;
		BigInteger z1 = new BigInteger("1");

		while (x <= 10) {
			x++;
			a = a + x;
			BigInteger a1 = BigInteger.valueOf(a);
			z1 = z1.multiply(a1);

			System.out.println("Z = " + z1);

		}

	}

}
