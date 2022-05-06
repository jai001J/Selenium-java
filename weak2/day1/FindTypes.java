package weak2.day1;

public class FindTypes {
	public static void main(String[] args) {
		String test = "$$ Welcome to 2nd Class of Automation $$ ";

		int letter = 0, space = 0, num = 0, specialChar = 0;
		char[] array = test.toCharArray();
		for (int i = 0; i < array.length; i++) {
			if (Character.isLetter(array[i])) {
				letter = letter + 1;

			}
			if (Character.isDigit(array[i])) {
				num = num + 1;

			}
			if (Character.isSpaceChar(array[i])) {
				space = space + 1;

			}
			if (!Character.isLetter(array[i]) && !Character.isDigit(array[i]) && !Character.isSpaceChar(array[i])) {
				specialChar = specialChar + 1;

			}
		}
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);
	}

}