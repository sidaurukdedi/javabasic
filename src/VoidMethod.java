public class VoidMethod {
	public static void main(String args[]) {
		greet("John");
		greet("Kevin");
		greet("Stacy");
	}

	public static void greet(String name) {
		System.out.println("Hello " + name);
	}
}
