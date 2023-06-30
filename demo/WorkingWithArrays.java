package demo;

import java.util.Arrays;
public class WorkingWithArrays {

	public static void main(String[] args) {

//		int[] num = { 1, 3, 5, 2, 6 };
//		int num1[] = new int[5];
//		num1[2] = 10;
//		num1[4] = 7;
//
//		System.out.println(num[3]);
//		System.out.println(num[4]);

//	 for (int index = 0; index < num.length; index++) {
//		 
//		 System.out.println(num[index]);
//	 }

//	 System.out.println("===== while loop =======");

//	 int index = 0;
//	 while (index < num.length) {
//		 System.out.println(num[index]);
//		 index++;
//	 }

//	 System.out.println("1.===== for each loop =======");
//	 for (int number : num) {
//		 String res = "odd";
//		 if (number % 2 == 0) {
//			 res = "even";
//		 }
//		 System.out.println(number + " is " + res);
//		 System.out.println(number);
//	 }

//	 for (int index = 0; index < num.length; index++) {
//		 String res = num[index] % 2 == 0 ?
//				 "even" : "odd";
//		 System.out.println(num[index] + " is " + res);
//	 }

//	 System.out.println("2.===== for each loop =======");
//	 for (int index = 0; index < num.length; index++) {
//		 String res = "odd";
//		 if (num[index] % 2 != 0) {
//			 res = "even";
//		 }
//		 System.out.println(num[index] + " is " + res);
//	 }

		int[][] arrays = new int[2][3];
		arrays[1][2] = 60;
		arrays[0][2] = 50;
		arrays[1][0] = 30;

		arrays[1][1] = 40;
		arrays[0][1] = 20;
		arrays[1][0] = 10;

//		System.out.println(Arrays.toString(arrays));
//		System.out.println(Arrays.deepToString(arrays));

		for (int i = 0; i < arrays.length; i++) {
//			System.out.println(arrays[i]);
//			 System.out.println(Arrays.toString(arrays[i]));
			for (int j = 0; j < arrays[i].length; j++) {
//				System.out.println(arrays[i][j]);
			}
		}
		
		System.out.println("------ working with twodimentional array in a single line ---------");
		
		int [] [] twoDimension = {{10,20,50},
								  {30,40,50}
		};
		for (int [] Num: twoDimension) {
			for (int Num1: Num) {
//				System.out.println(Num1);
			}
		}
		
//		String name1 = "Lawson loves java";
//		String name2 = new String("Lawson");
		String name = " Lawson loves java";
//		
//		name1 = name1.toLowerCase();
//
//		System.out.println(name1.length());
//		System.out.println(name1.toUpperCase());
//		System.out.println(name1.toLowerCase());
//		System.out.println(name1.charAt(5));
//		System.out.println(name1.substring(6));
//		System.out.println(name1.substring(6, 11));
//		System.out.println(name.substring(6, 11));
//		System.out.println(name1.indexOf('j'));
//		System.out.println(name1.indexOf('l'));
//		System.out.println(name1.indexOf('l', 4)); 
//		System.out.println(name1.contains("lawson"));
//
//		System.out.println("Before " + name);
//		name = name.replace('o', 'b');
//		System.out.println("After " + name);
//		System.out.println("========memory location=========");
		System.out.println(name.split(" "));
//		System.out.println(Arrays.toString(name.split(" ")));
//		String [] names = name.split(" ");
//		System.out.println(Arrays.toString(name.split(" ")));
//		
//		
//		System.out.println("=====Contains=====");
//		String vowel = "aeiouAEIOU";  
//		System.out.println(vowel.contains("i"));
//		System.out.println(vowel.contains("b"));
//		
//		String name3 = "Lawson", name4 = "lawson";
//		System.out.println(name3.equals(name4));
//		System.out.println(name3.equalsIgnoreCase(name4));
//		System.out.println(name3.concat(name4));
//		System.out.println(name1.lastIndexOf("o"));
//		System.out.println(name1.startsWith(name4));
//		System.out.println(name1.endsWith(name3));
//		
//		// value of method 
//		System.out.println("=====value of =====");
//		int num5 = 20;
//		String sNum = String.valueOf(num5);
//		System.out.println(num5);
//		String sNums = num5 + " ";
//		System.out.println(num5);
//		
//
//		System.out.println(name1.length());
//		System.out.println(name1.indexOf('j'));
		
		char [] get = new char [15];
		
		get[0] = 'A';
		get[3] = 'B';
		get[14] = 'C';
		
		String name7 = "java is simple";
		System.out.println(name7.length());
		
//		for (char c: get) {
//				System.out.println("letter is: " + c);
//		}
//		
//		System.out.println(Arrays.toString(get));
		
//		System.out.println(Arrays.toString(get));
//		name7.getChars(4,  13,  get, 4);
//		System.out.println(Arrays.toString(get));
		
		StringBuilder course = new StringBuilder(name7);
		System.out.println(course.capacity());
		System.out.println(course.length());
		
		System.out.println(course);
		course.append(" as well");
		System.out.println(course);
		
		System.out.println(course.capacity());
		System.out.println(course.length());

	}
}
