package com.sidauruk.dedi.abstraction;

public abstract class Customer {
	private String name;
	private String address;

	// Getter and Setter Method
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	// Abstract Method
	public abstract String getCustomerInfo(); // Abstract Method
}
