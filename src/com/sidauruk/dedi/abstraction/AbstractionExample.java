package com.sidauruk.dedi.abstraction;

public class AbstractionExample {
	public static void main(String args[]) {
		Employee emp1 = new Employee();
		emp1.setEmpId("123123");
		emp1.setName("Jhonie");
		emp1.setAddress("4176 Houston Avenue, Los Angeles, CA, 98210");
		System.out.println(emp1.getCustomerInfo());
		
//		Customer customer1 = new Customer(); // Cannot instantiate abstract class
	} 
}
