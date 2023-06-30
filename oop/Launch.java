package oop;
//import java.util.Scanner;

class Brown{
	// private int privateNum
	private int privateNum = 32;
//	private int num = 6;
	public String name;
	private int age = 23;
	
//	public int retrieve_the_variable() {
//		return privateNum;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public int getPrivateNum() {
//		return privateNum;
//	}
//
//	public int getNum() {
//		return num;
//	}

public void changeAge(int age) {
	if (age > 0)
		this.age = age;
	else
		this.age = 0;
}

public int getAge() {
	return age;
}


}
public class Launch {
	
	// private int privateNum = 32;
	
	public static void main(String[] args) {
//		for (int i = 0; i < 5; i++) {     
//			System.out.println(">>");              
//				int num = new Scanner(System.in).nextInt();
//				
//		switch (num) {
//		   case 3;
//		   case 6;
//		   	System.out.println("Three or six");
//		   	break;
//		   case 5;
//		 	System.out.println("Five");
//		   	
//		}
//		}
		
	//	System.out.println(privateNum);
		Brown br = new Brown();
	//	br.privateNum = 10;  //modify
		System.out.println("Old Age:" + br.getAge());   //retrieve
		br.changeAge(18);
		System.out.println("New Age:" + br.getAge());  
		
		//Launch j = new Launch();
		//System.out.println(j.privateNum);
		
	}
}
