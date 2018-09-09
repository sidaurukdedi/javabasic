public class NoStringInterpolation {
	public static void main(String args[]) {
		String custName = "Kevin";
		int age = 45;
		String streetName = "4131 California Avenue";
		String city = "Los Angeles";
		String state = "California";
		String country = "USA";
		String zipCode = "90012";
		
		// No String Interpolation
		System.out.println("Student Details: Name = " + custName + ", Age = " + age + ", Address = "
							+ streetName + ", City = " + city + ", State = " + state + ", Country = "
							+ country + ", ZipCode = " + zipCode);

	}
}
