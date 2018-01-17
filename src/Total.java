
public class Total {

	public static void main(String[] args) {
		int[] testArray = new int[10];
		int[] testArray2 = new int[10];

		for (int i=0; i<testArray.length; i++) {
			testArray[i] = i;
			testArray2[i] = i;
		}

		//		System.out.println(testArray);
		//		System.out.println(testArray2);
		//		printArray(testArray);
		//		printArray(testArray2);
		System.out.println("Total = " + total(testArray));
		printArray(testArray);
		doubleIt(testArray);
		printArray(testArray);

	}

	public static void printArray(int[] inArray) {
		System.out.print("[");
		for (int i=0; i<inArray.length-1; i++) {
			System.out.print(inArray[i] + ", ");
		}
		System.out.println(inArray[inArray.length-1]+"]");
	}

	public static int total(int[] inArray) {
		int sum = 0;
		int length = inArray.length;
		for (int i=0; i<length; i++) {
			sum += inArray[i];
		}
		return sum;
	}

	public static void doubleIt(int[] inArray) {
		int length = inArray.length;
		for (int i=0; i<length; i++) {
			inArray[i] *= 2;
		}
	}
}
