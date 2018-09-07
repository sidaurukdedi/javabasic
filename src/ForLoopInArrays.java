
public class ForLoopInArrays {
	public static void main(String args[]) {
		double[] numList = {121.9, 200.9, 304.4, 312.5};
		System.out.println("---Array For Loop Start---");
		for (int i = 0; i < numList.length; i++) {
			System.out.println(numList[i]);
		}
		System.out.println("---Array For Loop End---");
		
		
		
		double sum = 0;
		for (int i = 0; i < numList.length; i++) {
			sum = sum + numList[i];
		}
		System.out.println("Sum is = " + sum);
		System.out.println("------");
		
		double max = numList[0]; // initialize first element to be largest element
		// Find the largest element of an array
		for (int i = 0; i < numList.length; i++) {
			// Compare the element with the largest element 
			// if the next element is largest then the last element then
			// the new element is the maximum(largest) element
			if (numList[i] > max) {
				max = numList[i];
			}
		}
		System.out.println("Largest is = " + max);
	}
}
