package com.sidauruk.dedi.overloading;

public class Addition {
	// addition of two integer parameters
	public int add(int x, int y) {
		return x + y;
	}

	// addition of three integer parameters
	public int add(int x, int y, int z) {
		return x + y + z;
	}

	// addition of two double parameters
	public double add(double x, double y) {
		return x + y;
	}

	// Main Method
	public static void main(String args[]) {
		Addition a = new Addition();
		System.out.println(a.add(24, 24)); // Addition of two integers
		System.out.println(a.add(24, 24, 24)); // Addition of three integers
		System.out.println(a.add(12.24, 12.24)); // Addition of two doubles
	}
}
