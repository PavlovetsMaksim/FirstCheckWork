package edu.training.checkwork.main;

public class Example01 {

	public static void main(String[] args) {
		double x = 0.5;
		
		double res = Math.sqrt(Math.exp(2.2 * x)) - Math.abs(Math.sin((Math.PI * x) / (x + 2.0 / 3.0))) + 1.7;
		
		System.out.print("Результат: ");
		System.out.printf("%.5f", res);

	}

}
