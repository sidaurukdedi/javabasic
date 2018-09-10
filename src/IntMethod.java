public class IntMethod {
	public static void main(String args[]) {
		System.out.println("Your age is: " + findAge(1980));
		System.out.println("Your age is: " + findAge(1990));
		System.out.println("Your age is: " + findAge(1992));
		System.out.println("Your age is: " + findAge(1994));
		System.out.println("Your age is: " + findAge(1989));
	}

	private static int findAge(int year) {
		int age = 2018 - year;
		return age;
	}
}
