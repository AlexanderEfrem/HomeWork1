package by.AlexanderEfremenko.HomeWork01.If;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {

		Scanner sa = new Scanner(System.in);
		Scanner sb = new Scanner(System.in);

		int r1;
		System.out.print("Vvedite chislo r1 ");
		while (sa.hasNextInt() == false) {
			sa.next();
			System.out.print("Vvedite chislo r1 ");
		}
		r1 = sa.nextInt();

		int r2;
		System.out.print("Vvedite chislo r2 ");
		while (sb.hasNextInt() == false) {
			sb.next();
			System.out.print("Vvedite chislo r2 ");
		}
		r2 = sb.nextInt();

		if ((Math.PI * Math.pow(r1, 2)) > (Math.PI * Math.pow(r2, 2))) {
			System.out.println("First circle is larger");
		} else if (((Math.PI * Math.pow(r1, 2)) < (Math.PI * Math.pow(r2, 2)))) {
			System.out.println("Second circle is larger");
		} else {
			System.out.println("Circles are equal");
		}
	}
}
