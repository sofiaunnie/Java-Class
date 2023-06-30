package demo;

public class ClassFive2 {
	
	public static void main(String [] args) {
		Object[] values = {1,2,3, 'a', "asdb", 6.76F};
		
		A obj1 = new A("Person 1", 10);
		A obj2 = new A("Person 2", 20);
		A obj3 = new A("Person 3", 30);
		
//		obj1.displayAge();
//		obj1.displayName();
//		System.out.println(obj1);
		
		A rest [] = {obj1, obj2, obj3};
		
		for (A a : rest) {
			a.displayAge();
			a.displayName();
			System.out.println(a);
		}
	}

}
class A {
	String name;
	int age;
	public A(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "name: " + name + ", Age=" + age;
	}
	public void displayAge() {
		System.out.println("Age is: " + age);
	}
	public void displayName() {
		System.out.println("name is: " + name);
	}

}
