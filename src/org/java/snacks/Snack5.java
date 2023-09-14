package org.java.snacks;

import java.util.Scanner;

public class Snack5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentence = null;
		
		do {
			System.out.print("Insert a sentence or a word: ");
			sentence = sc.nextLine();
			
			if (sentence.trim().equals("0")) return;
			
			int alphabeticalCounter = 0;
			int numericCounter = 0;
			int symbolsCounter = 0;
			
			for (int i = 0; i < sentence.length(); i++) {
				char currentChar = sentence.charAt(i);
				
				String singleCharacter = Character.toString(currentChar);

				if (singleCharacter.matches("[a-zA-Z]")) {
					alphabeticalCounter++;
				} else if (singleCharacter.matches("[0-9]")) {
					numericCounter++;
				} else if (singleCharacter.matches("\\S")) {
					symbolsCounter++;
				}
			}
			
			System.out.println("The word / sentence " + sentence + " has: " + alphabeticalCounter + " alphabetical characters, " + numericCounter + " numbers and " + symbolsCounter + " symbols");
		} while (!sentence.trim().equals("0")); // while (true) ALSO WORKS BECAUSE OF THE return AT ROW 14
	}
}
