package weak3.day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		//Declare an ArrayList to store String values
		List<String> list=new ArrayList<String>();
		list.add("We");
		list.add("learn");
		list.add("java");
		list.add("basics");
		list.add("as");
		list.add("part");
		list.add("of");
		list.add("java");
		list.add("sessions");
		list.add("in");
		list.add("java");
		list.add("week1");
		System.out.println("Sentence is : " + list);
		
		//Declare a LinkedHashSet to store the list values
		Set<String> set=new LinkedHashSet<String>();
		//Add the list values in to LinkedHashSet to remove duplicate entries
		set.addAll(list);
		System.out.println("Removed Duplicate words : " + set );
		
	}
}