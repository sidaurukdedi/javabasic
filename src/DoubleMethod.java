public class DoubleMethod {
	public static void main (String args[]){
		int number1 = 25;
		int number2 = 245;
		double sum = add(number1, number2);
		System.out.println("Sum is : "+sum);
	}

	private static double add(int number1, int number2) {
		// TODO Auto-generated method stub
		double total = number1 + number2;
		return total;
	}
	
}
