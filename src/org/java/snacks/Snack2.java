package org.java.snacks;

import java.util.Random;

public class Snack2 {
	public static void main(String[] args) {
		String[] names = { "Mattia", "Lorenzo", "Giuseppe", "Giuseppe", "Luca", "Domiziano", "Giovanni", "Davide", "Raffaele" };
		String[] lastNames = { "Volpe", "Catalano", "Vignanello", "Sciacca", "Macedone", "De Santis", "Lampis", "Meda", "Capaldo" };
		
		Random rnd = new Random();
		for (byte i = 0; i < names.length ; i++) {
			String rndName = names[rnd.nextInt(0, names.length)];
			String rndLastName = lastNames[rnd.nextInt(0, names.length)];
			System.out.println(rndName + " " + rndLastName);
		}
	}
}
