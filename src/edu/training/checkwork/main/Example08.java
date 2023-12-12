package edu.training.checkwork.main;

public class Example08 {

	public static void main(String[] args) {
		double x = 0.1;
		double xMax = 10.0;

		while (x <= xMax) {
			double f = x * x - Math.exp(2 * x) + 4;

			System.out.println("При x = " + x + ", f = " + f);

			if (f < 0) {
				System.out.println("Пройден нуль функции при x = " + x + ", f = " + f);

				break;
			}

			x += 0.1;
		}

	}

}
