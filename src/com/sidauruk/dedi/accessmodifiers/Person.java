package com.sidauruk.dedi.accessmodifiers;

//Default : Only Accessible within class and package
public class Person {
	int age = 40;
	
	//default method - it does not have private, public or protected acccess modifiers
	void greet(String name){
		System.out.println("Hello, " + name);
	}
}
