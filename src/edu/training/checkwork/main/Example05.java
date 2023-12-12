package edu.training.checkwork.main;

public class Example05 {

	public static void main(String[] args) {		
		int n = 21;
		int a = 1;
		double x = -2 * a;
		double dX = a / 5.0;
		
		double y = 0;
		
		for (int i = 1; i <= n; i++) {
			if (x <= 0) {
				y = (a / 2.0) * (Math.exp(x / a) + Math.exp(-x / a));
			} else {
				y = (4 * Math.pow(a, 3)) / (x * x + 4 * a * a);
			}
			
			System.out.print("При x = ");
			System.out.printf("%.3f", x);
			System.out.print(", y = ");
			System.out.printf("%.3f", y);
			System.out.println();
			
			x += dX;
		}
		
	}

}
