 package oop;

 abstract public class Shoe {
public final String brand;
public final double size;

    public Shoe(String brand, double size) {
    	this.brand = brand;
    	this.size = size;
		}
    
    public void show() {
    	System.out.println("Show from Shoe Class");    }
   
	public abstract void Christopher();
	 
    public static void main(String[] args) {
   Running shoe1 = new Running("Nike", 43, 250);
   shoe1.show();
   Walking shoe2 = new Walking("Hangwang", 43.5, true);
   shoe2.show();
   Walking shoe3 = new Walking("Merrell", 42, false);
   shoe3.show();
   
   Shoe[] shoes = {shoe1,shoe2,shoe3};
  	for (Shoe shoe : shoes) {
  		
  		System.out.print(shoe.brand + "\t");
  		System.out.print("size " + shoe.size + "\t");
//  		System.out.println("1." + shoe.getClass());
//  		System.out.println("2." + shoe.getClass().getSimpleName());
  
  		
//  		String ClassName = shoe.getClass().getSimpleName();
//  		if (ClassName.equals("Running"))
//          System.out.println("Running ...  Class");
//       	else if (ClassName.equals("Walking"))
//  		 System.out.println("Running ... Class");
//  			
//  			
  		if (shoe instanceof Running) {
  	Running don = (Running) shoe;
  	int my_weight = (int) don.weight;
  	System.out.println(don.weight + "grams/shoe");
  		} else if (shoe instanceof Walking) {
  	Walking wk = (Walking) shoe;
  	boolean gore_tex = wk.goreTex;
   	if(gore_tex) {
		System.out.println("Gore-Tex");
	} else {
	System.out.println("No Gore-Tex");
		}
  	
  		}
  	}

	}
}	

class Walking extends Shoe{
	
public final boolean goreTex;

	@Override
	public void Christopher() {
		}

	public Walking(String brand, double size, boolean goreTex) {
		super(brand,size);
		this.goreTex = goreTex;
		
	}	
	
}

class Running extends Shoe{
public final double weight;

	public Running(String brand, double size, double weight) {
		super(brand,size);
		this.weight = weight;
	}

	@Override
	public void Christopher() {
		
	}
	

}



