package com.sidauruk.dedi.javaintermediate;

public class EncapsulationMethod {
	public static void main(String args[]) {
		Encapsulation cust1 = new Encapsulation();
		cust1.setName("John");
		cust1.setIdNum("23434");
		cust1.setAge(35);
		System.out.println(
				String.format("%s's with id Num:%s is %d years old", cust1.getName(), cust1.getIdNum(), cust1.getAge()));
//		System.out.println(cust1.age); // not available because private object
		cust1.address = "Metro, Lampung";
		System.out.println(cust1.address); 
	}
}
