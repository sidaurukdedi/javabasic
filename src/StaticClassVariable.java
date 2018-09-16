class ClassVariable {
	public static String name; // static variable for name
	public static String address; // static variable for address
}

class StaticClassVariable {
	public static void main(String args[]) {
		ClassVariable.name = "John";
		ClassVariable.address = "1212 California Avenue, Richmond, VA 22601";
		System.out.println(ClassVariable.name);
		System.out.println(ClassVariable.address);
		
		ClassVariable.name = "Danny";
		ClassVariable.address = "1212 California Avenue, Tyson, VA 22601";
		System.out.println(ClassVariable.name);
		System.out.println(ClassVariable.address);
	}
}
