public class ORConditionalExpression {
	public static void main(String args[]) {
		double account_balance = 1050600.04;
		int age = 55;
		if (account_balance >= 10000000 || age >= 65) {
			System.out.print("You can retire now, Good Luck!");
		} else {
			System.out.println("You still need to save money for your retirement");
		}
	}
}
