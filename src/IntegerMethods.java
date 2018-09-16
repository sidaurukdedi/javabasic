public class IntegerMethods {
	public static void main(String args[]) {
		Integer a = 100;
		Integer b = 34;
		Integer c = 13;
		Integer d = 100;

		System.out.println(a.intValue()); // return integer value of a
		System.out.println(b.doubleValue()); // return double value of b
		System.out.println(c.floatValue()); // return float value of c
		System.out.println(Integer.parseInt("241313"));
		System.out.println(Integer.compare(100, 100)); // return 0 if equals
		System.out.println(Integer.compare(100, 90)); // return 1 if x > y
		System.out.println(Integer.compare(90, 100)); // return -1 if x < y
		System.out.println(a.equals(d)); // return true if a equals d else return false
		System.out.println(a.equals(c)); // return true if a equals c else return false
	}
}
