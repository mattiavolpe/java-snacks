package org.java.snacks;

import java.util.Scanner;

public class Snack6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Type a number: ");
		String numericString = sc.nextLine();
		
		sc.close();
		
		long number = 0L;
		long power = 1L;
		
		char[] digits = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		
		for (int i = numericString.length() - 1; i >= 0; i--) {
			char currentNumericChar = numericString.charAt(i);
			
			for (int j = 1; j < digits.length; j++) {
				if (currentNumericChar == digits[j]) {
					number += j * power;
				}
			}
			
			power *= 10L;
			
		}
		System.out.println(number);
	}
}
