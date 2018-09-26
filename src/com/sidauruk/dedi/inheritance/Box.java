package com.sidauruk.dedi.inheritance;

public class Box {
	// Variables
	private int length;
	private int width;

	// Constructor
	public Box(int l, int w) {
		this.length = l;
		this.width = w;
	}

	// Display Box Name
	public void displayBoxName() {
		System.out.println("I am parent box class");
	}
}
