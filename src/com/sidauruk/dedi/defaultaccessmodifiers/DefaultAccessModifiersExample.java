package com.sidauruk.dedi.defaultaccessmodifiers;

import com.sidauruk.dedi.accessmodifiers.Person; // how to connect from the outside

public class DefaultAccessModifiersExample {
	public static void main(String args[]) {
		Person person1 = new Person();
		person1.greet("Jhonny"); // can't access because default access modifiers
	}
}
