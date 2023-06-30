package oop;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ErrorHandling {

	public static void main(String[]args) {
		
	for (int i = 0; i < 3; i++) {	
		System.out.print(">>");
		int num = new Scanner(System.in).nextInt();
		try {
			if (num < 0) {
				throw new ArithmeticException("Invalid Input....");
			}
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
			System.out.println("End");
		
		// Scanner sc = null;
		//try-with resources
		
//		try (Scanner sc1 = new Scanner(System.in))	{
//			sc1.next();
//			System.out.println(5/2);	
//			System.out.println("Start");	
//		} catch (NumberFormatException ar) {
//			System.out.println(ar.getMessage());
//		} catch (NullPointerException ar){
//			System.out.println(ar.getMessage());
//		} catch (Exception ar) {
//			System.out.println("234367774323");	
//		} finally {
//			System.out.println("Finally Block");	
//		}
//			System.out.println("End");

		
//		try {
		// String number = "50";
		//	System.out.println(number + 1000);	
		//	Integer num1 = Integer.parseInt(number);
		//	int num = Integer.parseInt("wert");
//          double d_num = Double.parseDouble(number);
			
		//	System.out.println(num + 1000);
	//	} catch (NumberFormatException ar) {
		//	System.out.println(ar.getMessage());
		// }
//			System.out.println("End");
	
		//try - catch
//		System.out.println("Start >> ");
//		try {
//			Scanner sc = new Scanner(System.in);
//		System.out.println("First Number: ");
//		int num1 = sc.nextInt();
//		
//		System.out.println("Second Number: ");
//		int num2 = sc.nextInt();
//		
//		System.out.println(num1/num2);
//		
//		//System.out.println(5/0);
//		System.out.println("Two...");
//		} catch (InputMismatchException ex) {
//			System.out.println("Incorrect value entered" + ex.getMessage());
//		} catch (ArithmeticException ex1 ) {
//			System.out.println("error:" + ex1.getMessage());
//		}
//		   // catch("Exception ex"){
//			// System.out.println(ex.getMessage());
//			// System.out.println("Error occurred..." );
//			// ex.printStackTrace();
//		//        }
//		System.out.println("End");
//		
//		int grade = 90;
//		
//		if (grade >= 50)
//			System.out.println("C");
//		if (grade >= 60)
//			System.out.println("B");
//		if (grade >= 70)
//			System.out.println("A");
		
	
      }
}