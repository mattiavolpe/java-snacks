package org.java.snacks;

import java.util.Arrays;
import java.util.Random;

public class Snack3 {
	public static void main(String[] args) {
		int[] numbers = new int[10];
		
		int sum = 0;
		
		Random rnd = new Random();
		
		for (byte i = 0; i < 10; i++) {
			numbers[i] = rnd.nextInt(101);
			
			if (i % 2 == 0) {
				sum += numbers[i];
			}
		}
		
		System.out.println(Arrays.toString(numbers));
		System.out.println("The sum of the oddly positioned elements is " + sum);
	}
}
