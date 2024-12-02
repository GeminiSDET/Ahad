package OctJavaProgram;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {

		int[] numbers = {5,2,8,1,9,3};
		
		System.out.println("Original array" + Arrays.toString(numbers));
		Arrays.sort(numbers);
		System.out.println("Sorted array" + Arrays.toString(numbers));

		
	}

}
