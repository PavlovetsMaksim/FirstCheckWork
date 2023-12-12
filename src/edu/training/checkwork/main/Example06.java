package edu.training.checkwork.main;

import java.util.Random;

public class Example06 {

	public static void main(String[] args) {
		int count = 0;
		
		int [] k = new int[20];
		
		double f = 0;
		
		double a = 3 * Math.pow(10, 3);
		double b = 6 * Math.pow(10, 4);
		double m = 4.0;
		
		initArrayWithRandom(k);
		
		printArray(k);
		
		double t1 = Math.sqrt(a + b + m);
		double t2 = m * Math.sqrt(a + b);
		double t3 = Math.sqrt(a * b * m);
		double t4 = m * Math.sqrt(a * b);
		
		System.out.println("\nt1 = " + t1);
		System.out.println("t2 = " + t2);
		System.out.println("t3 = " + t3);
		System.out.println("t4 = " + t4);
		
		System.out.println("\nРезультат:");
		
		for (int i = 0; i < k.length; i++) {
			f = Math.pow(k[i], 3) - (25 * k[i] * k[i]) + (50 * k[i]) + 1000;
			
			if ((f >= t1 && f <= t2) || (f >= t3 && f <= t4)) {
				System.out.println("f(K) = " + f);
			} else {
				count++;
			}
		}
		
		System.out.println("\nКоличество значений, не удовлетворяющих условию: " + count);

	}
	
	public static void initArrayWithRandom(int[] mas) {
		Random rand = new Random();
		
		for (int i = 0; i < mas.length; i++) {
			mas[i] = 60 - rand.nextInt(91);
		}
	}
	
	public static void printArray(int[] mas) {		
		for (int i = 0; i < mas.length; i++) {
			System.out.print("[" + mas[i] + "]");
		}
		
		System.out.println();
	}

}
