package oop;

public interface Animal3 {

	public static final int mum1 = 5;
	int num2 =10;
	
	int square(int num);
	public abstract int addition(int num1, int num2);
	
}

class Herbivors3 implements Animal3{
	public int square(int num) {
		return num * num;
	}
	public int addition(int num1, int num2) {
		int num3 = num1 + num2;
		System.out.println("Sum is " + num3);
		return num3;
	}
	

public class Launch{
	public static void main(String [] args) {
		Animal3 obj = new Herbivors3();
		int res = obj.square(25);
		System.out.println("1. Sqaure is: "+ res);
	}
}
}


