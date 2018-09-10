public class StringMethod {
	public static void main(String args[]) {
		System.out.println(greet("Danny"));
		System.out.println(greet("John"));
		System.out.println(greet("Stacy"));
	}

	public static String greet(String name) {
		return "Hello, " + name + ". Welcome to Java Class"; 
	}
}
