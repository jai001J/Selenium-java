package week1.day2;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Here is the input
		int[] arr = { 1, 2, 4, 5, 6, 7, 8 };
		// Sort the array
		Arrays.sort(arr);
		// loop through the array (start i from arr[0] till the length of the array)
		int length = arr.length;
		for (int i = 0; i < length - 1; i++) {
			// System.out.println("Value of i - " + (i + 1));
			// System.out.println("Value of a - " + arr[i]);
			// check if the iterator variable is not equal to the array values respectively
			if (i + 1 != arr[i]) {
				// print the number
				System.out.println("The Missing element in array is - " + (i + 1));
				// once printed break the iteration
				break;
			}
		}
	}
}
