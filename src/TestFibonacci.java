public class TestFibonacci {
	public static void main(String args[]) {
		int a = 0, b = 1, hasil = 0;
		int loop = 15;
		for (int i = 0; i < loop; i++) {
			System.out.println(hasil + ", ");
			a = b;
			b = hasil;
			hasil = a + b;
		}
	}

}
