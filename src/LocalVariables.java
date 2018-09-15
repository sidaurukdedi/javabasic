public class LocalVariables {
	public void getDog() {
		int age = 0; // Local Variable for dog
		age = age + 12;
		System.out.println("Dog age is : " + age);
	}

	public static void main(String args[]) {
		LocalVariables local = new LocalVariables();
		local.getDog();
	}
}
