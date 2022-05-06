package weak3.day2;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {
	public static void main(String[] args) {
		// Declare a list for {3,2,11,4,6,7};
		List<Integer> firstList = new ArrayList<Integer>();
		// Add values to the first list
		firstList.add(3);
		firstList.add(2);
		firstList.add(11);
		firstList.add(4);
		firstList.add(6);
		firstList.add(7);
		System.out.println("First List is :  " + firstList);
		// Declare another list for {1,2,8,4,9,7};
		List<Integer> secondList = new ArrayList<Integer>();
		// Add values to the second list
		secondList.add(1);
		secondList.add(2);
		secondList.add(8);
		secondList.add(4);
		secondList.add(9);
		secondList.add(7);
		System.out.println("Second List is : " + secondList);
		// Return common elements in both the list
		firstList.retainAll(secondList);
		System.out.println("The common elements in both the list are : " + firstList);
	}
}