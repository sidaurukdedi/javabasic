public class ConstructorMethod101 {
	// ConstructorMethod
	public ConstructorMethod101() {
		System.out.println("This is constructor method");
	}

	// ConstructorMethod with parameter
	public ConstructorMethod101(String param) {
		System.out.println("This is constructor method with parameter : " + param);
	}

	// Instance Method
	public void InstanceMethod() {
		System.out.println("This is Instance Method");
	}
}

class ConstructorMethodExample{
	public static void main(String[] args){
		// Create object method1 with default constructor
		ConstructorMethod101 method1 = new ConstructorMethod101();
		method1.InstanceMethod();
		
		// Create object method2 with constructor having parameter
		ConstructorMethod101 method2 = new ConstructorMethod101("Constructor ");
		method2.InstanceMethod();
	}
}