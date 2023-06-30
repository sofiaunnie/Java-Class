package demo;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Hangman2 {
	
	enum Gender {
		MALE,FEMALE
		}	
	
	Gender maleorfemale;
	
	
//	enum Gender {MALE,FEMALE}						
//	Gender maleorfemale;
//	
	public Hangman2 () {
		maleorfemale = Gender.FEMALE;
		maleorfemale = Gender.MALE;
	}

public static void main(String[] args) {
	Random rd = new Random();
	Scanner sc = new Scanner(System.in);
	
	String[] countries = {"Algeria","Afghanistan","Australia","Madagascar","South Korea", "London", "Canada", "America","Argentina",
			              "France","England", "Brazil", "Italy", "Mauritaus", "Malaysia", "Isreal" , "France", "Iran", "Porteguese",
			              "Turkey", "Isreal", "Uganda"};
	
	System.out.print("How many .... want to guess?");
	int count = sc.nextInt();
	
	for (int i = 0; i < 5; i++) {                            //opening of curly bracket
		int num = rd.nextInt(0,countries.length);
		String country = countries[num];
		country = country.toUpperCase();
	//	System.out.println(country);
		
		int len = country.length();
		System.out.println(country + " has " + len + " letters");				
		
		//INDIA (-----)  || - - - - -
		
		String dashes = "" , wrong = "";
		for (int j = 0; j < len; j++) {
			dashes += "-";
		}                                                             // closing of curly bracket
		
		System.out.println(country + " == " + dashes);	
	//	Scanner sc = new Scanner(System.in);
		
		for (int k = 0; k < 5; k++)  {          // using for loop   //opening of curly bracket
//		int k = 0;                               // using while loop
//		while(k < 5){                         
			
	//		while (dashes.contains("-")) {
			
		System.out.print(">> ");
		String input = sc.nextLine().toUpperCase();
		char letter = input.charAt(0);
		
		if (country.contains(String.valueOf(letter))) {
			String replaceDashes = "";
			for (int l = 0; l < dashes.length() ; l++) {
				if(letter == country.charAt(1)) {
					replaceDashes += letter;
				System.out.println("Dashed String: " + replaceDashes);
				} else {
					replaceDashes += dashes.charAt(1);
				}
			}
			dashes = replaceDashes;
			
			System.out.println(letter + "is present in " + country);       
		} else // {
		//	System.out.println(letter + "is absent in " + country);  
			wrong += String.valueOf(letter);
		   //  wrong = wrong + String.valueOf(letter);
		}
		    char[] missedLetters = wrong.toCharArray();
		    System.out.println("missed leters: " + wrong);  
		    System.out.println("missed leters: " + missedLetters);
		    System.out.println("missed leters: " + Arrays.toString(missedLetters)); 
		                                                      
		}                                                // closing of curly bracket
	
		
	// for (int i = 0; i < 5; i++) {
	// int num = rd.nextInt(15);
	// System.out.println("Random" + num);
	// }
}
}
