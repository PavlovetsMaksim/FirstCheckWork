package edu.training.checkwork.main;

import java.util.Random;

public class Example04 {

	public static void main(String[] args) {
		int n = 10;
		
		int [] masX = new int[n];
		int [] masY = new int[n];
		
		initArrayWithRandom(masX);
		initArrayWithRandom(masY);
		
		printArray(masX);
		printArray(masY);
		
		System.out.println("Количество точек, попавших в заданную область: " + countPoints(masX, masY));

	}
	
	public static void initArrayWithRandom(int[] mas) {
		Random rand = new Random();
		
		for (int i = 0; i < mas.length; i++) {
			mas[i] = 3 - rand.nextInt(7);
		}
	}
	
	public static void printArray(int[] mas) {		
		for (int i = 0; i < mas.length; i++) {
			System.out.print("[" + mas[i] + "]");
		}
		
		System.out.println();
	}
	
	public static int countPoints(int [] mas1, int [] mas2) {
		int count = 0;
		
		for (int i = 0; i < mas1.length; i++) {
			if (((mas1[i] >= -2 && mas1[i] <= 0) && (mas2[i] >= 0 && mas2[i] <= 2)) || ((mas1[i] >= 0 && mas1[i] <= 2) && (mas2[i] >= -1 && mas2[i] <= 1))) {
				count++;
			}
		}
		
		return count;
	}

}
