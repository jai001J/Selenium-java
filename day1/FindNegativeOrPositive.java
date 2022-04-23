package week1.day1;

public class FindNegativeOrPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Initialize a number, say, int number= 35;
		int inputVal = -1;
		// 2. If a number is positive, print "The number is positive"
		if (inputVal > 0) {
			System.out.println("The number is positive");
		} else {
			// If it nether negative nor positive, print as "The number is neither positive
			// nor negative"

			if (inputVal == 0) {
				System.out.println("The number is neither positive nor negative");
			} else {
				// If a number is negative, print "The number is negative"
				System.out.println("The number is negative");

			}
		}
	}
}