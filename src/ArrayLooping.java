
public class ArrayLooping {
	public static void main(String args[]) {
		String[] studentName;
		studentName = new String[] { "John", "David", "Henry", "Bob", "Victor" };
		int[] studentAge = new int[] { 29, 25, 42, 31, 33 };
		System.out.println(studentName[0]);
		System.out.println(studentName[2]);
		System.out.println(studentName[4]);
		System.out.println(studentAge[1]);
		System.out.println(studentAge[4]);
		
		System.out.println("----Array For Loop Start----");
		for (int i = 0; i < studentName.length; i++) {
			System.out.println(studentName[i]);
		}
		System.out.println("----Array For Loop End----");
	}
}
