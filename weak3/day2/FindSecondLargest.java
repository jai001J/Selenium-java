package weak3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {
	public static void main(String[] args) {
		//// Create a list to store Integer values
		List<Integer> listValues = new ArrayList<Integer>();
		listValues.add(3);
		listValues.add(2);
		listValues.add(11);
		listValues.add(4);
		listValues.add(6);
		listValues.add(7);
		// Arrange the array in ascending order
		Collections.sort(listValues);
		// Print the sorted list
		System.out.println("The sorted list values are : " + listValues);
		// Pick the 2nd element from the last and print it
		Integer secondElementFromLast = listValues.get(listValues.size() - 2);
		System.out.println("The second element from the last is  : " + secondElementFromLast);
	}

}