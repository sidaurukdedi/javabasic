package com.sidauruk.dedi.polymorphism;

public class MotorBike extends Vehicle {
	public MotorBike(String make, String model, int year) {
		super(make, model, year);
	}

	// Start Method
	public void start() {
		System.out.println(String.format("%s %s %d starting", getMake(), getModel(), getYear()));
	}

	// Stop Method
	public void stop() {
		System.out.println(String.format("%s %s %d stopping", getMake(), getModel(), getYear()));
	}

}
