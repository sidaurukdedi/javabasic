package com.sidauruk.dedi.collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String args[]) {
		// Create Non-Generic LinkedList that can be contain any abject
		List linkedList1 = new LinkedList();
		linkedList1.add("element1"); // add String
		linkedList1.add(1); // add Integer
		linkedList1.add(2, 5.24);
		System.out.println(linkedList1);
		linkedList1.remove(0);
		System.out.println(linkedList1);
		linkedList1.removeAll(linkedList1);
		System.out.println(linkedList1);
		System.out.println("--------------------------------------");

		// Create Generic LinkedList that can contain only one abject
		List linkedList2 = new LinkedList<String>();
		linkedList2.add("element1");
		linkedList2.add(1, "element2");
		System.out.println(linkedList2);
		linkedList2.remove(0);
		System.out.println(linkedList2);
		System.out.println("--------------------------------------");

		// Create Generic LinkedList that can contain only one abject
		LinkedList<String> linkedList3 = new LinkedList<String>();
		linkedList3.add("String2");
		linkedList3.add(1, "element2");
		System.out.println(linkedList3);
		linkedList3.remove(0);
		System.out.println(linkedList3);

	}
}
