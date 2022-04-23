package week1.day1;

public class FibanocciSeries {
	/*
	 * Goal: To find Fibonacci Series for a given range
	 * 
	 * input(range): 8 output: 0, 1, 1, 2, 3, 5, 8, 13
	 * 
	 * Shortcuts: 1) Print : type: syso, followed by: ctrl + space + enter 2) To
	 * create a 'for' loop: type 'for', followed by ctrl + space + down arrow +
	 * enter
	 * 
	 * What are my learnings from this code? 1) 2) 3)
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range = 8;
		int firstNum = 0;
		int secNum =1;
		//print first number
		System.out.println(firstNum);
		//iterate from 1 to the range
		for (int i = 0;i<=range;i++){
			//add first number and second number and assign to sum
			int sum = firstNum + secNum;
			//assign second number to the first number	
			firstNum = secNum;
			//assign sum to the second number
			secNum = sum;
			//print sum
			System.out.println(sum);
		}
		}
		
	}