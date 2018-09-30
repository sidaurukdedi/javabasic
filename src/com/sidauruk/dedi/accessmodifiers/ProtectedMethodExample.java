package com.sidauruk.dedi.accessmodifiers;

public class ProtectedMethodExample extends Employee { // using protected access modifiers
	public static void main(String args[]) {
		ProtectedMethodExample p1 = new ProtectedMethodExample();
		p1.greet("Sam");
	}
}
