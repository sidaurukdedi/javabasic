package com.sidauruk.dedi.accessmodifiers;


//Private : Accessible within package and outside the package but through inheritance only
//			The Protected access modifier can be applied on the data member, method and constructor.
//			It can't be applied on the class.
public class Employee {
	// Protected Method
	protected void greet(String name) {
		System.out.println(String.format("Hello, %s", name));
	}
}
