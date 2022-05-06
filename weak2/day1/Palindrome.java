package weak2.day1;

public class Palindrome {
	public static void main(String[] args) {
		String str = "Madam";
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);

		}
		if (str.equalsIgnoreCase(rev)) {
			System.out.println(str + " is a Palindrome string");
		} else {
			System.out.println(str + "is not a Palindrome string");
		}
	}
}