package org.java.snacks;

import java.util.Scanner;

public class Snack1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Type a number: ");
		int number = sc.nextInt();
		
		System.out.println(
		number % 2 == 0
				? number
				: ++number
		);

		sc.close();
	}
}
