package com.sidauruk.dedi.inheritance;

public class Employee extends Person { // Inheritance
	private String SSN;

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
	}
}

class InheritanceExample {
	public static void main(String args[]) {
		// Create person object
		Person person1 = new Person();
		person1.setName("Pam");
		person1.setAge(32);
		System.out.println(String.format("%s's age is : %s", person1.getName(), person1.getAge()));

		// Create Employee Object
		Employee emp1 = new Employee();
		emp1.setName("Stacy");
		emp1.setAge(28);
		emp1.setSSN("341-234-2134");
		System.out.println(String.format("%s's with SSN %s, age is : %s", emp1.getName(), emp1.getSSN(), emp1.getAge()));
	}
}