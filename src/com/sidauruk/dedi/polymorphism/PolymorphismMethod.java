package com.sidauruk.dedi.polymorphism;

public class PolymorphismMethod {
	public static void main(String args[]) {
		// Create Object from parent class
		Vehicle v1 = new Vehicle("Ford", "F150", 2012);
		v1.start();
		v1.stop();
		System.out.println("-----------------------------");

		// Create SUV Object
		SUV v2 = new SUV("Toyota", "RAV4", 2016);
		v2.start();
		v2.stop();
		System.out.println("-----------------------------");

		// Create Semi Object
		Semi v3 = new Semi("Volvo", "VML", 2010);
		v3.start();
		v3.stop();
		System.out.println("-----------------------------");

		// Create Motorbike Object
		MotorBike v4 = new MotorBike("Harley", "Samson", 2013);
		v4.start();
		v4.stop();
		System.out.println("-----------------------------");
	}
}
