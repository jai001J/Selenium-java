package weak2.day1;

public class CharOccurance {
	public static void main(String[] args) {
		String input = "welcome to chennai";
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == 'w')
				count++;
		}
		System.out.println("The number of 'e' in the string is " + count);
	}
}