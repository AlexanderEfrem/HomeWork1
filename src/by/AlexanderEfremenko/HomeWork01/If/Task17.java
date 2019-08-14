package by.AlexanderEfremenko.HomeWork01.If;

import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {

		Scanner sm = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		double z;
		double z1;

		double m;
		System.out.println("Vvedite chislo m ");
		while (sm.hasNextInt() == false) {
			sm.next();
			System.out.print("Vvedite chislo m ");
		}
		m = sm.nextInt();

		double n;
		System.out.println("Vvedite chislo n ");
		while (sn.hasNextInt() == false) {
			sn.next();
			System.out.print("Vvedite chislo n ");
		}
		n = sn.nextInt();

		if (m != n) {
			if (m > n) {
				n = m;
			} else {
				m = n;
			}
		} else {
			m = 0;
			n = 0;
		}

		System.out.println("Result m = " + m + "\nResult n = " + n);

	}

}
