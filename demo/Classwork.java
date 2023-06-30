package demo;
import java.util.Scanner;

public class Classwork {

	public static void main(String[] args) {
		String word = "Simple Java".toUpperCase();
		for(int i = 0; i < 7 ; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.print(">> ");
			char letter = sc.nextLine().toUpperCase().charAt(0);
			for(int j = 0; j < word.length() ; j++) {
				
				if (letter == word.charAt(j)) {
					System.out.println(letter + " is present at index " + j);
					
				
				}
				
			}
		}
	}
}
