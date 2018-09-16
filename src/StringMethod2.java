public class StringMethod2 {
	public static void main(String args[]) {
		String str1 = "Hello Students";
		String str2 = "Welcome";
		String str3 = "test";
		String str4 = "Java";
		String str5 = "          String           ";
		int totalStudents = 50;
		String str6 = "abc, def, ghi";
		String[] strCount = str6.split("\\s+"); // Split string with regex
												// expression
		System.out.println(str1.concat(str2)); // Append string2 to string1
		System.out.println(str1.replace("e", "a")); // Replace 'e' character to
													// 'a'
		System.out.println(str3.toLowerCase()); // Convert string to lowercase
		System.out.println(str4.toUpperCase()); // Convert string to uppercase
		System.out.println(str5.trim()); // Trim whitespace to string
		System.out.println(String.valueOf(totalStudents)); // Parse int to
															// string
		System.out.println(strCount.length); // Find length of string

		// For each loop to print out each records
		for (String s : strCount) {
			System.out.println("Word: " + s);
		}
	}
}
