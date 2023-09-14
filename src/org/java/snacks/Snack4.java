package org.java.snacks;

import java.util.Scanner;

public class Snack4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insert a sentence or a word: ");
		
//		NOT REVERSING HERE BECAUSE WE WANT TO KEET THE ORIGINAL INPUT TO SHOW IT AT THE END OF THE CODE
		String sentence = sc.nextLine();
		
		sc.close();

//		USING replaceAll TO REMOVE ALL THE SPACES
		String sentenceToReverse = sentence.toLowerCase().replaceAll("\\s+", "");
		
//		SOLUTION WITH THE REVERSE METHOD
//		String reversedString = new StringBuilder(sentenceToReverse).reverse().toString();
		
//		System.out.println(
//			sentenceToReverse.equals(reversedString)
//			? "The word / sentence " + sentence + " IS palindrome"
//			: "The word / sentence " + sentence + " IS NOT palindrome"
//		);
	
		for (int i = 0; i < sentenceToReverse.length() / 2; i++) {
			if (sentenceToReverse.charAt(i) != sentenceToReverse.charAt(sentenceToReverse.length() - i - 1)) {
				System.out.println("The word / sentence " + sentence + " IS NOT palindrome");
				return;
			}
		}
		
		System.out.println("The word / sentence " + sentence + " IS palindrome");
	}
}
