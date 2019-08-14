package by.AlexanderEfremenko.HomeWork01.Cycles;

import java.math.BigInteger;
import java.lang.*;

public class Task12 {

	public static void main(String[] args) {
		int a;
		int x = 1;
		BigInteger mnog;

		BigInteger mnog2 = new BigInteger("1");

		for (a = 1; x < 11; a = 6 + a--) {
			x++;
			BigInteger a1 = BigInteger.valueOf(a);
			mnog2 = mnog2.multiply(a1);
			System.out.println("Result " + mnog2);

		}

	}

}
