package com.sidauruk.dedi.inheritance;

public class BigBox extends Box {
	private int length;
	private int width;
	private int height;

	public BigBox(int l, int w, int h) {
		super(l, w);
		this.length = l;
		this.width = w;
		this.height = h;
	}

	// Display Box Name
	public void displayBoxName() {
		System.out.println("I am big box class");
	}

	// Display Area
	public void printArea() {
		double area = length * width * height;
		System.out.println("Area is " + area);
	}
}
