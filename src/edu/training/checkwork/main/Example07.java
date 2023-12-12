package edu.training.checkwork.main;

public class Example07 {

	public static void main(String[] args) {
		int n = 5;
		int m = 6;

		int countN = 1;
		int countM = 1;

		double hX = 0.5;
		double hZ = 0.4;

		double x = 1;
		double z = 1.2;

		double f = 0;

		int tmp = Math.max(n, m);

		for (int i = 1; i <= tmp; i++) {
			System.out.println("x = " + x);
			System.out.println("z = " + z);

			f = Math.sqrt((z * z) + x * x) * Math.log(z)
					+ ((Math.abs(Math.log(z)) / (Math.sqrt((x * x) - (z * z) + 3.2))));

			countN++;
			countM++;

			if (countN <= n) {
				x += hX;
			}

			if (countM <= m) {
				z += hZ;
			}

			System.out.println("f = " + f + "\n");
		}

	}

}
