class Car {
	String make;
	String model;
	int year;

	public Car(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}

	// Getter Method
	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}

	// Setter Method
	public void setMake(String make) {
		this.make = make;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setYear(int year) {
		this.year = year;
	}

	// Starting
	public void start() {
		System.out.println("Starting...");
	}
}

public class AccessorSetterMethod {
	public static void main(String args[]) {
		// Create ford object
		Car toyota = new Car("Toyota", "RAV4", 2015);
		
		// Use setter method to set new value
		toyota.setMake("Toyota");
		toyota.setModel("Prius V");
		toyota.setYear(2016);
		
		// Use getter method to get value
		System.out.println("Car make is : " + toyota.getMake());
		System.out.println("Car model is : " + toyota.getModel());
		System.out.println("Car yar is : " + toyota.getYear());
		toyota.start();
	}
}
