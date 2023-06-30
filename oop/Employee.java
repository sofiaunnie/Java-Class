package oop;

public class Employee {
	 String name, department, manager;
//	
//	private String privatevariable = "Hyunjin";
//	protected String protectedvariable = "Christopher";
//	public String publicvariable = "Seungmin";
//	String packagePrivateVariable = "Changbin";
	
//	String name, department, manager;
	
//	public Employee(String name, department, manager) {
//	this.department = department;
//	}
	public Employee() {
		name = "Felix";
		department = "Entertainment";
		manager = "JYP";
		System.out.println(">> Employee Default Constructor...");
	}
	
	public Employee(String name,String manager, String department){
				this.department = department;
				this.name = name;
				this.manager = manager;
				System.out.println("Exra Constructor");
	}
 	
	
	public void showName() {
		System.out.println("Name from Employee Class is: " + name);
	}
	
	public void showDepartment() {
		System.out.println(" Department is: " + department);
	}
	
	public void showManager() {
		System.out.println("Manager is: " + manager);
	}
	
	public void showDetails() {
		System.out.println("Parent Class");
		System.out.println("Name is: " + name);
		System.out.println("Manager is: " + manager);
		System.out.println(" Department is: " + department);
		}
	
    @Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + ", manager=" + manager + "]";
	}
    
    
public static void main(String [] args) {
	
//	 Employee e1 = new Manager(); 
//	 Employee e2 = new Employee(); 

//	  Employee emp1 = new Employee(); 
//	  System.out.println(emp1);

	 
	Manager mgr1 = new Manager();
	mgr1.showDetails();
//	mgr1.showBranch();
//	mgr1.showManager();
//	mgr1.showDepartment();
//	
//	
	
	
//	System.out.println(mgr1.packagePrivateVariable);
////	System.out.println(mgr1.PrivateVariable);
//	System.out.println(mgr1.protectedvariable);
//	System.out.println(mgr1.publicvariable);
//	
	
//	System.out.println(mgr1);
	}

}

class Manager extends Employee{
//	String name, department, manager;
	String branch = "JYPE Seoul";
	
	public Manager() {
		System.out.println(">> Manager Default Constructor...");
	}
	
	public Manager (String name,String manager, String department,String branch){
		super(name,manager,department);
		this.branch = branch;
		System.out.println("Manager Class Extra Constructor");
}
//	public void showName() {
//		System.out.println("Name from Manager class is: " + name);
//	}
	
	@Override
	public void showDetails() {
        super.showDetails();
		System.out.println("Branch is: " + branch);
		}
//
//	public void showDepartment() {t
//		System.out.println("Department is: " + department);
//	}
//
//	public void showManager() {
//		System.out.println("Manager is: " + manager);
//	}

	public void showBranch() {
		System.out.println("Branch is: " + branch);
	}
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + ", manager=" + manager + ", branch=" + branch
				+ "]";
	}	
}


	
