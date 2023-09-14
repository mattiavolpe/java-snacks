package org.java.snacks;

import java.util.Scanner;

public class Snack9 {
	public static void main(String[] args) {
		short sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("Type a number: ");
			short number = sc.nextShort();
			
			sum += number;
			
			if (sum > 1000) {
				sc.close();
				return;
			}
			
			System.out.println("Current sum: " + sum);
		}
	}
}
