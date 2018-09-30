package com.sidauruk.dedi.collections;

import java.util.Vector;

public class VectorExample {
	public static void main(String args[]) {
		// Create vector1 initializing vector class
		Vector vector1 = new Vector();
		vector1.add(10); // add vector element 10 in vector1
		vector1.add("String1"); // add vector element 30 in vector1
		vector1.add(false); // add vector element 25 in vector1
		System.out.println("Vector 1 is : " + vector1); // print out vector1
		System.out.println("Vector size is : " + String.valueOf(vector1.size())); // print out vector1 size
		vector1.remove(1); // Remove element at index 1
		System.out.println("Vector 1 is : " + vector1); // print out vector1
		System.out.println("Vector size is : " + String.valueOf(vector1.size())); // print out vector1 size
		
		// Create vector1 initializing vector class
		Vector vector2 = new Vector(2);
		vector2.add(30); // add vector element 30 in vector1
		vector2.add("String2"); // add vector element 40 in vector1
		vector2.add(true); // add vector element 25 in vector1
		System.out.println("Vector 2 is : " + vector2); // print out vector2
		System.out.println("Vector size is : " + String.valueOf(vector1.size())); // print out vector2 size
		vector2.remove(1); // Remove element at index 2
		System.out.println("Vector 2 is : " + vector2); // print out vector2
		System.out.println("Vector size is : " + String.valueOf(vector1.size())); // print out vector2 size
	}
}
