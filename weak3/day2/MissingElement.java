package weak3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {
	public static void main(String[] args) {
		//// Create a list to store Integer values
		List<Integer> listValues = new ArrayList<Integer>();
		listValues.add(1);
		listValues.add(2);
		listValues.add(3);
		listValues.add(4);
		listValues.add(7);
		listValues.add(6);
		listValues.add(8);
		// Arrange the array in ascending order
		Collections.sort(listValues);
		// Print the sorted list
		System.out.println("The sorted list values are : " + listValues);
			}
}