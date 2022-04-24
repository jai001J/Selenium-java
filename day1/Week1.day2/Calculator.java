package week1.day2;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator objCal = new Calculator();
		int sumVal = objCal.add(1, 2, 3);
		System.out.println(sumVal);
		int subVal = objCal.sub(1, 2);
		System.out.println(subVal);
		int multiplyVal = objCal.mulitply(1, 2);
		System.out.println(multiplyVal);
		float divideVal = objCal.divide(5, 2);
		System.out.println(divideVal);

	}

	public int add(int a, int b, int c) {
		return (a + b + c);
	}

	public int sub(int a, int b) {
		return (a - b);
	}

	public int mulitply(int a, int b) {
		return (a * b);
	}

	public int divide(int a, int b) {
		return (a / b);
	}
}
