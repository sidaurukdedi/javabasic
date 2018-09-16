public class StringMethod1 {
	public static void main(String args[]) {
		String str1 = "Hello Students" + " Welcome to Java World";
		String str2 = "Welcome";
		String str3 = "";

		System.out.println(str1.length()); // Find length of string
		System.out.println(str1.substring(1)); // Return string after 1 index
		System.out.println(str1.substring(6, 13));
		System.out.println(str1.contains("Hello")); // Return true if str1
													// contains hello
		System.out.println(str2.equals("welcome")); // Return true/false if str2
													// equals Hello
		// Return true/false if str2 equals hello ignoring UPPERCASE/LOWERCASE
		// character
		System.out.println(str2.equalsIgnoreCase("welcome"));
		System.out.println(str3.isEmpty()); // Return true if str3 is empty
	}
}
