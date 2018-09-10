public class DogClass {
	public static void main(String args[]) {
		// 1st dog
		name_of_dog("Max");
		bark();
		sleep();
		eat();
		play();
		
		// 2nd dog
		name_of_dog("Jacky");
		bark();
		sleep();
		eat();
		play();
	}

	public static void name_of_dog(String name) {
		System.out.println(String.format("My name is = %s", name));
	}

	public static void bark() {
		System.out.println("I am a barking");
	}

	public static void sleep() {
		System.out.println("I am sleeping");
	}

	public static void eat() {
		System.out.println("I am eating");
	}

	public static void play() {
		System.out.println("I am playing");
	}
}
