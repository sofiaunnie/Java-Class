package demo;
import java.util.Arrays;
enum Gender {MALE,FEMALE; 
	
	
	public void diplay() {
		System.out.println("From my enum");
	}
	
}


enum Fruit {Orange,Melon, Mango, Apple}

public class ClassFive {
	//	Fruit my_fruit = Fruit.Melon;
	
	String name;
	
		
		public static void main(String [] args) {

//			System.out.println(Fruit.Orange);
//			// System.out.println(Fruit.values());
//			Fruit [] fruits = Fruit.values();
//			System.out.println(fruits);
//			
//			for (Fruit f : fruits) {
//				System.out.println(f);
//			}
			/*
			 * System.out.println(Mango.Carrie); Mango mg = Mango.Carrie;
			 * System.out.println(mg); System.out.println("The price of " + mg + "is: " +
			 * mg.getPrice()); mg.showItems();
			 * System.out.println(Arrays.toString(Fruit.values()));
			 */
			
			Gender varia = Gender.FEMALE;
			System.out.println("2. Gender is : " + varia);
			varia.diplay();
		}
}

enum Mango{
	Carrie(10), FairChild(20), Haden(30);
	public int price;
	Mango(int i){
		price =  i;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void showItems() {
		for (Mango Fruit : Mango.values()) {
			System.out.println("The price of " + Fruit + "is: " + Fruit.getPrice());
		}
	}
}