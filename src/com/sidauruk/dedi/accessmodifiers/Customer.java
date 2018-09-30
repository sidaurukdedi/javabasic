package com.sidauruk.dedi.accessmodifiers;

// Private : Only Accessible within class
public class Customer {
	private int age = 40; // private age variable
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	// private msg method
	private void msg(String name) {
		System.out.println(String.format("Hello, %s", name));
	}
}

class PrivateExample {
	public static void main(String args[]) {
		Customer customer1 = new Customer();
		System.out.println(customer1.getAge());
		// customer1.msg("John"); // The method msg(String) from the type Customer is not visible (Private)
	}
}
