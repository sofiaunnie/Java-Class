package oop;
import java.util.InputMismatchException;

import java.util.Scanner;
public class ErrorHandling1 {
	
//	public static void main(String[] args) {

//		int one, two;
//		one = accept_num("Enter first no:");
//		two = accept_num("Enter second no:");
//		if (one > two) {
//			System.out.println(one + " is greater");
//		} else if (one == two) {
//			System.out.println("Same values");
//		} else {
//			System.out.println(two + " is greater");
//		}
//		while (true) {
//			try {
//				Scanner sc = new Scanner(System.in);
//				one = sc.nextInt();
//
//				break;
//			} catch (InputMismatchException e) {
//				System.out.println("Invalid input");
//			}
//		}
//		while (true) {
//			try {
//				Scanner sc = new Scanner(System.in);
//				two = sc.nextInt();
//
//				break;
//			} catch (InputMismatchException e) {
//				System.out.println("Invalid input");
//			}
//		}
//
//		if (one > two) {
//			System.out.println(one + " is greater");
//		} else if (one == two) {
//			System.out.println("Same values");
//		} else {
//			System.out.println(two + " is greater");
//		}
//		System.out.println("End");
//	}
//	}
//	private static int accept_num(String msg) {
//		int num;
//		while (true) {
//			try {
//				Scanner sc = new Scanner(System.in);
//				System.out.println(msg);
//				num = sc.nextInt();
//
//				if (num < 1 || num > 12) {
//					throw new Mike("Error! Manually defined error");
//				}
//				break;
//			} catch (InputMismatchException e) {
//				System.err.println("Invalid input");
//			} catch (ArithmeticException e) {
//				System.err.println("Only values 1 - 12 is allowed...");
//			} catch (Exception e) {
//				System.err.println("Generic exception: " + e.getMessage());
//			}
//		}
//		return num;
//	}
//}
//
//class Mike extends Exception{
//	
//	public Mike() {
//		super();
//	}
//	
//	public Mike(String msg) {
//		super(msg);
//	}
//}
}
