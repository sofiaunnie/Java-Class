package demo;

public class Loops {


//	public static void main(String[] args) {
//		 TODO Auto-generated method stub
//		
//		 loops -- for loop, while loop, do -while loop
//		 initialization; condition; increment/decrement
//		System.out.println("start");
//		int num = 0;
//		for (num = 7; num > -7; num -=2) {
//			System.out.println("Number is: "+ num);
//		}
//		System.out.println("End" + num);
//
//	}
//	int value = 0, num2 = 1;
//	for(value = 7; num2 <= 12; num2+=1) {
//		System.out.println(value + " * " + num2 + " = "+(value * num2));
//	}
//	
//	 
//	for (int i = 0; i < 25; i+=1){
//		if ((i % 5 == 0) && (i % 3 == 0)) {
//			System.out.println("Fittbuzz");
//		}
//		else if(i % 5 == 0) {
//			System.out.println("buzz");
//		}
//		else if(i % 3 == 0) {
//			System.out.println("fitt");
//		}
//		else {
//			System.out.println(i );
//		}
//	}
//
//	}
	
	public static void main(String [] args) {
		// FOR LOOP
		for (int i = 0; i < 7; i++) {
			if (i % 2 ==0)
//			System.out.println("A: " + i);	
//			System.out.println("B: " + i);
			
			if (i % 2 ==0) {
//				System.out.println("A: " + i);	
//				System.out.println("B: " + i);
			}
			
		}
		
		int e = 0;
		for (;;) {
			
			if (e == 1000)
				break;
			System.out.println(e);
			e++;
		}
		
		for (int i = 0; i < 15; i=i+1) {
			
//			if (i % 4 ==0) {
//			System.out.println("A: " + i);
			continue;
//			}else
//				System.out.println("B: " + i);
//			System.out.println("in the loop");
		}
	}
	
}
