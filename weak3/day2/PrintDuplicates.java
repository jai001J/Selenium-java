package weak3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintDuplicates {
	public static void main(String[] args) {
		//Declare an ArrayList to store String values
		List<String> list=new ArrayList<String>();
		list.add("14");
		list.add("12");
		list.add("13");
		list.add("11");
		list.add("15");
		list.add("14");
		list.add("18");
		list.add("16");
		list.add("17");
		list.add("19");
		list.add("18");
		list.add("17");
		list.add("20");
		// Arrange the array in ascending order
		Collections.sort(list);
		// Print the sorted list
		System.out.println("The sorted list values are : " + list);
		// Print the duplicate values
		String duplicateValues = list.get(list.size() - 2);
		String duplicateValues1 = list.get(list.size() - 3);
		System.out.println("duplicateValues is : " + duplicateValues);
		System.out.println("duplicateValues is : " + duplicateValues1);
	}
}