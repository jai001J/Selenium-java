package weak2.day1;

public class ReverseEvenWords {
	public static void main(String[] args) {
		String test = "I am a software tester";
		String[] split = test.split(" ");
		for (int i = 0; i < split.length; i++) {
			String reverseWord = " ";
			if (i % 2 != 0) {
				char[] array = test.toCharArray();
				for (int j = array.length - 1; j >= 0; j--) {
					reverseWord = reverseWord + array[j];
				}
				System.out.println(reverseWord + " ");

			} else {
				System.out.println(test);
				System.out.println(split[i] + " ");
			}
		}
	}

}