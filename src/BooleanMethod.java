public class BooleanMethod {
	public static void main(String args[]) {
		System.out.println("Is number even? " + isEven(20));
		System.out.println("Is number even? " + isEven(25));
		System.out.println("Is number even? " + isEven(40));
		System.out.println("Is number even? " + isEven(63));
	}

	private static boolean isEven(int number) {
		// TODO Auto-generated method stub
		if (number % 2 == 0) {
			return true;
		}
		return false;
	}
}
