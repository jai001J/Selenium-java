package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Pseudo Code

		// a) Declare An array for {3,2,11,4,6,7};
		int arr[] = { 3, 2, 11, 4, 6, 7 };
		boolean val = false;
		// b) Declare another array for {1,2,8,4,9,7};
		int arr1[] = { 1, 3, 8, 4, 2, 9, 7 };
		// c) Declare for loop iterator from 0 to array length
		for (int i = 0; i < arr.length; i++) {

			// d) Declare a nested for another array from 0 to array length
			for (int j = 0; j < arr1.length; j++) {
				// e) Compare Both the arrays using a condition statement
				if (arr[i] == arr1[j] & val != true) {
					// f) Print the first array (shoud match item in both arrays)
					System.out.println("The Intersected element in array is - " + arr[i]);
					val = true;
				}

			}

		}
	}
}
