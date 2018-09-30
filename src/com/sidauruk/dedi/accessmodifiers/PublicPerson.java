package com.sidauruk.dedi.accessmodifiers;

//Public : Accessible everywhere. It has the widest scope among all other modifiers
public class PublicPerson {
	// Public Method
	public void greet(String name) {
		System.out.println(String.format("Hello, %s", name));
	}
}
