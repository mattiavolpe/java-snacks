package org.java.snacks;

import java.util.Scanner;

public class Snack7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Type in the seconds: ");
		int inSeconds = sc.nextInt();
		
		sc.close();
		
		int hours = inSeconds / 60 / 60;
		
		int minutes = (inSeconds - (hours * 60 *60)) / 60;
		
		int seconds = inSeconds - (hours * 60 * 60) - (minutes * 60);
		
		System.out.println(inSeconds + " seconds: -> " + String.format("%02d", hours) + ":" + String.format("%02d", minutes) + ":" + String.format("%02d", seconds));
	}
}
