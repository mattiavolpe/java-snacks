package org.java.snacks;

import java.util.Arrays;
import java.util.Random;

public class Snack10 {
	public static void main(String[] args) {
		int[] numbers = new int[10];
		
		Random rnd = new Random();
		
		for (byte i = 0; i < 10; i++) {
			numbers[i] = rnd.nextInt(100, 1001);
		}
		
		System.out.println("Original array: " + Arrays.toString(numbers));
		
		System.out.println("\nEven numbers: ");
		for (byte i = 0; i < 10; i++) {
			if (numbers[i] % 2 == 0) {
				System.out.println(numbers[i]);
			}
		}
		
		System.out.println("\nOdd numbers: ");
		for (byte i = 0; i < 10; i++) {
			if (numbers[i] % 2 != 0) {
				System.out.println(numbers[i]);
			}
		}
		
		System.out.println("\nEven index numbers: ");
		for (byte i = 0; i < 10; i += 2) {
			System.out.println(numbers[i]);
		}
		
		System.out.println("\nOdd index numbers: ");
		for (byte i = 1; i < 10; i += 2) {
			System.out.println(numbers[i]);
		}
	}
}
