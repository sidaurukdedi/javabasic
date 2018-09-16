public class Constants {
	public static String name;
	public static final double PI = 3.14;
}

class ConstantsMethod {
	public static void main(String args[]) {
		Constants.name = "Dan";
		System.out.println(Constants.name);
		System.out.println(Constants.PI);
	}
}
