package by.AlexanderEfremenko.HomeWork01.Cycles;

import java.math.BigInteger;

public class Task10 {

	public static void main(String[] args) {

		int x;
		BigInteger mnog = new BigInteger("1");

		for (x = 1; x < 201; x++) {
			int c = x * x;
			BigInteger c1 = BigInteger.valueOf(c);
			mnog = mnog.multiply(c1);
			System.out.println("Result " + mnog);
		}

	}

}
