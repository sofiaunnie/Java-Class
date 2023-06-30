package demo;

import java.util.Scanner;
public class WhileLoops {

	public static void main(String[] args) {
		
	}
		
	
		// TODO Auto-generated method stub
//		int count;
//		for (count = 0; count < 10; count++) {
			//System.out.println("Number is: " + count);
//		}

//		int count = 1;		
//		while (count <= 10) { //condition
//			if (count % 3 == 0)
//			System.out.println("Number is: " + count);
//			count++;
//			
//		}
		
		// ------ while true loop -------
//		int count = 15;		
//		while (true) { //condition
//			System.out.println("Number is: " + count);
//			if (count == 10000)
//				break;
//			count++;
//			
//		}
//		-------do while loop-----
//		int count = 1;
//		do {
//			System.out.println("Number is: " + count);
//			count++;
//			}while(count <= 10);
		
	//	System.out.println("while loop");
		
//		int count = 11;
//		while (count <= 10) {
//			System.out.println("Number is: " + count);
//			count++;
//		}

//		checkLetter('e');
//		checkLetter('i');
//		checkLetter('u');
		
		public static void checkLetter (char guess) { //open
			String word = "simple java";
//			Scanner scarnner = new Scanner(System.in);
//			System.out.print("Letter");
//			char guess = scanner.nextLine().charAt(0);
			
			for (int i = 0; i < word.length(); i++) { //open
				if (guess == word.charAt(i)) {   // open
					System.out.println(guess + " is present");
				}               //close
			}                  // close
		
	}                      //close
	}

