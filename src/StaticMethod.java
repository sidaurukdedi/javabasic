public class StaticMethod {
	public static void main(String args[]) {
		name_of_dog("Max");
		bark();
		sleep();
	}

	// Static method that provides name of dog
	private static void name_of_dog(String name) {
		System.out.println("My name is : " + name);
	}

	private static void bark() {
		System.out.println("I am barking");
	}

	private static void sleep() {
		System.out.println("I am sleeping");
	}
}
