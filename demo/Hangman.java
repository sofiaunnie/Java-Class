package demo;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class Hangman {
	
	public static void main(String[] args) {
		Random rd = new Random();
		
		String [] countries = {"Algeria","Afghanistan","Madagascar","Uganda",
				"Ghana","Nigeria"};
		System.out.print("How many countries do you want to guess? ");
		Scanner sc  = new Scanner(System.in);
		int count = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i<count; i++) {
			int num = rd.nextInt(0,countries.length);
			String country = countries[num];
			country = country.toUpperCase();
//			System.out.println(country);
		
			int len = country.length();
//			System.out.println(country + " has " + len + " letters");
			
			String dashes = "", wrong = "";
			for (int j = 0; j < country.length(); j++) {
				dashes += "-";
			}
			System.out.println("Guess the Country: " + dashes);
		
//			for(int k = 0; k<7; k++) {
			while(dashes.contains("-")) {
			System.out.println(">> ");
			String input = sc.nextLine().toUpperCase();
			System.out.println("Length: " + input.length());
			char letter = input.charAt(0);
			
			if(country.contains(String.valueOf(letter))) {
				String replaceDashes  = "";
				for (int a =0; a <dashes.length(); a++) {
					if (letter==country.charAt(a)) {
						replaceDashes += letter;
					}else {
						replaceDashes += dashes.charAt(a);
					}
				}
				System.out.println("Dashed string " + replaceDashes);
				dashes = replaceDashes;
					System.out.println(letter + " is present");
				}else { 
					wrong += String.valueOf(letter);
					System.out.println("Try Again!");
				}
			}
			char [] missedLetters = wrong.toCharArray();
				System.out.println("Missed letters: " + wrong);
				System.out.println("Missed letters: " + missedLetters);
				System.out.println("Missed letters: " + Arrays.toString(missedLetters));
		}
		
	}
}
		
