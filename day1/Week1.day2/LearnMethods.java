package week1.day2;

public class LearnMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearnMethods objCar = new LearnMethods();
		objCar.printCarName();
		String carnumber = objCar.getCarNumber();
		System.out.println(carnumber);
		String carvariant = objCar.getCarVariant();
		System.out.println(carvariant);
		int outputformultiply = objCar.multiplyTwoNumber(5, 5);
		System.out.println(outputformultiply);
	}

	public void printCarName() {
		System.out.println("Maruthi Suzuki");
	}

	public String getCarNumber() {
		return "TN31 W1CF4RTY789.,ṀNB Vs78iolp;/2528";
	}

	public String getCarVariant() {
		return "Sedan";
	}

	public int multiplyTwoNumber(int a, int b) {
		return (a * b);
	}
}
