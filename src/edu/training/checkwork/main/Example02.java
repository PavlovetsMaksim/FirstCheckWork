package edu.training.checkwork.main;

public class Example02 {

	public static void main(String[] args) {
		int count = 1;
		
		double res = 0;
		
		for (double x = 0.5; x <= 1.0; x += 0.05) {
			res = Math.sqrt(Math.exp(2.2 * x)) - Math.abs(Math.sin((Math.PI * x) / (x + 2.0 / 3.0))) + 1.7;
			
			System.out.println("------------------");
			System.out.print("|" + count + "|");
			System.out.printf("%.2f", x);
			System.out.print("|");
			System.out.printf("%.6f", res);
			System.out.println("|");
			
			count++;
		}
		
		System.out.println("------------------");

	}

}
