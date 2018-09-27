package com.sidauruk.dedi.overriding;

public class OverridingMethod {
	public static void main(String args[]) {
		Animal animal1 = new Animal(); // references to animal class
		Animal animal2 = new Dog(); // references to dog class
		Dog animal3 = new Dog();
		
		animal1.talk();
		animal2.talk();
		animal3.talk();
	}
}
