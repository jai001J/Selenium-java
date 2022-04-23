package week1.day1;

public class ConvertNegToPosNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Initialize an integer with a negative number like, int number = -40;
		int inputVal = -35;
		// 2. Check if the number is a negative number
		// Hint : any number that is lesser than zero is a negative number
		if (inputVal < 0) {
			int convertedVal = Math.abs(inputVal);
			// 3. If so, convert the number to a positive nubmer

			// 4. Print as below
			System.out.println("The number - (" + inputVal + ") is converted to - " + convertedVal);
		}
	}
}