class Customer {
	// Customer Method
	public Customer() {
		System.out.println("Welcome to Warteg");
	}

	// Instance Method
	public void getName(String name) {
		System.out.println("Customer name is : " + name);
	}
}

public class ConstructorMethod {
	public static void main (String[] args){
		Customer customer1 = new Customer(); // create object from customer class
		customer1.getName("Danny");
		
		Customer customer2 = new Customer(); // create object from customer class
		customer2.getName("Deena");
	}
}
