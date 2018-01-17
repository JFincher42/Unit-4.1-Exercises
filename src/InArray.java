
public class InArray {

	public static int total(int[] inArray) {
		int sum = 0;
		int length = inArray.length;      

		for (int i = 0; i < length; i++) {        
			sum = sum + inArray[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] myArray = {1,2,3,4,5};
		System.out.print(total(myArray));
	}

}
