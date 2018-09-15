class AutoMobile {
	String make;
	String model;
	int year;

	public AutoMobile(String make, String model, int year) {
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

	// Starting
	public void start() {
		System.out.println("Starting...");
	}
}

public class AccessorGettermethod {
	public static void main(String args[]){
		AutoMobile toyota = new	AutoMobile("Toyota", "RAV4", 2015);
		
		// use getter method to get the value
		System.out.println("Car make is : " + toyota.getMake());
		System.out.println("Car make is : " + toyota.getModel());
		System.out.println("Car make is : " + toyota.getYear());
		toyota.start();
	}

}
