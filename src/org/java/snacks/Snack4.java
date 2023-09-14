package org.java.snacks;

import java.util.Scanner;

public class Snack4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insert a sentence or a word: ");
		
//		Not reversing here because we want to keep the original input to show it at the end of the code
		String sentence = sc.nextLine();

//		Using replaceAll to remove all the spaces
		String sentenceToReverse = sentence.toLowerCase().replaceAll("\\s+", "");
		
		String reversedString = new StringBuilder(sentenceToReverse).reverse().toString();
		
		System.out.println(
				sentenceToReverse.equals(reversedString)
				? "The word / sentence " + sentence + " IS palindrome"
				: "The word / sentence " + sentence + " IS NOT palindrome"
		);
	}
}
