package org.generation.italy;

import java.util.Random;

public class Snack2 {
	public static void main(String[] args) {
		String[] names = {"Arianna", "Michela", "Alessandro", "Angela"};
        String[] surnames = {"Verdi", "Rossi", "Bianchi","Neri"};

        for (int i = 0; i < names.length; i++) {
            Random rnd = new Random();
            int rndName = rnd.nextInt(names.length);
            int rndSurname = rnd.nextInt(surnames.length);
            System.out.println(names[rndName] + " " + surnames[rndSurname]);
        }
		
		
	}
	

}
