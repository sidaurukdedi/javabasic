class Vehicle {
	String make;
	String model;
	int year;

	// Constructor with parameter
	public Vehicle(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}

	public void start() {
		System.out.println("Starting...!!!");
	}
}

public class ConstructorMethodWithParameter {
	public static void main (String[] args){
		// Create ford object
		Vehicle ford = new Vehicle("ford", "Taurus", 2012);
		ford.start();
	}
}
