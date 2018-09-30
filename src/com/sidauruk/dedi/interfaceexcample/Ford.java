package com.sidauruk.dedi.interfaceexcample;

public class Ford implements Vehicle {
	@Override
	public void start() {
		System.out.println("System Starting");
	}

	@Override
	public void stop() {
		System.out.println("System Stopping");
	}

	@Override
	public void cruise() {
		System.out.println("System Cruising");
	}

	public static void main(String args[]) {
		Ford f150 = new Ford();
		f150.start();
		f150.cruise();
		f150.stop();

		// Vehicle v1 = new Vehicle(); // Cannot instantiate abstract class
		// because interface same with abstract class
	}

}
