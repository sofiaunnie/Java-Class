package oop;

public class Employee2 {
	String name, department, manager;
	public void showName() {
		System.out.println("Name is: " + name);
	}
	
	public void showDepartment() {
		System.out.println("Department is: " + department);
	}
	
	public void showManager() {
		System.out.println("Manager is: " + manager);
	}
	
    @Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + ", manager=" + manager + "]";
	}
    
public static void main(String [] args) {
	Employee2 emp1 = new Employee2();
	System.out.println(emp1);
	
	Manager2 mgr1 = new Manager2();
	System.out.println(mgr1);
	}
}

class Manager2 {
	
	String name, department, manager, branch;
	public void showName() {
		System.out.println("Name is: " + name);
	}

	public void showDepartment() {
		System.out.println("Department is: " + department);
	}

	public void showManager() {
		System.out.println("Manager is: " + manager);
	}

	public void showBranch() {
		System.out.println("Branch is: " + branch);
	}
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + ", manager=" + manager + ", branch=" + branch
				+ "]";
	}	
}


	
