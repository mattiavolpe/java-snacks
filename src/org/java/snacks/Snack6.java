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
		
		for (int i = numericString.length() - 1; i >= 0; i--) {
			char currentNumericChar = numericString.charAt(i);
			
			if (i != numericString.length() - 1) {
				power *= 10L;
			}
			
			switch(currentNumericChar) {
				case '1':
					number += 1 * power;
					break;
				case '2':
					number += 2 * power;
					break;
				case '3':
					number += 3 * power;
					break;
				case '4':
					number += 4 * power;
					break;
				case '5':
					number += 5 * power;
					break;
				case '6':
					number += 6 * power;
					break;
				case '7':
					number += 7 * power;
					break;
				case '8':
					number += 8 * power;
					break;
				case '9':
					number += 9 * power;
					break;
				default:
					break;
			}
		}
		System.out.println(number);
	}
}
