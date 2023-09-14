package org.java.snacks;

import java.util.Arrays;
import java.util.Random;

public class Snack8 {
	public static void main(String[] args) {
		int[] numbers = new int[10];
		Random rnd = new Random();
		
		for (byte i = 0; i < 10; i++) {
			numbers[i] = rnd.nextInt(100, 151);
		}
		
		System.out.println(Arrays.toString(numbers));
		
		int min = numbers[0];
		int max = numbers[0];
		int sum = 0;
		
		for (byte i = 0; i < 10; i++) {
			int currentNumber = numbers[i];
			
			if (currentNumber < min) {
				min = currentNumber;
			}
			
			if (currentNumber > max) {
				max = currentNumber;
			}
			
			sum += currentNumber;
		}
		
		float avg = sum / 10;
		
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
		System.out.println("Average: " + String.format("%.02f", avg));
	}
}
