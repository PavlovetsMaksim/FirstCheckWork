package edu.training.checkwork.main;

public class Example03 {

	public static void main(String[] args) {
		double x = 0.5;
		int n = 20;
		
		double sum = 0;
		
		for (int k = 1; k <= n; k++) {
			double tmp = (Math.sin((k * x) / 2) + Math.sin((k * x - 1) / 2)) / Math.exp(x - 1.0 / k);
			
			sum += tmp;
		}
		
		double result = Math.sqrt(n * Math.PI) * sum;
		
		System.out.print("Итоговое значение: ");
		System.out.printf("%.2f", result);

	}

}
