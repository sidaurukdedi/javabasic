class Employee {
	// Instance Variable
	public String name; // public variable that is visible for any child class
	private int age; // variable that is visible for Employee class only

	// Constructor Method
	public Employee(String name) {
		this.name = name;
	}
	
	// Set age
	public void setAge(int age){
		this.age = age;
	}
	
	// Display Employee Info
	public void displayEmpInfo(){
		System.out.println("Name is : " + name);
		System.out.println("Age is : " + age);
	}
}

public class InstanceVariable {
	public static void main (String args[]){
		Employee emp1 = new Employee("Dan");
		emp1.setAge(29);
		emp1.displayEmpInfo();
	}
}
