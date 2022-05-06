package weak3.day1;

public class AxisBank {
	public void deposit() {
		System.out.println("deposit the money");
	}

	public static void main(String[] args) {
		BankInfo bankinfo = new BankInfo();
		AxisBank axisbank = new AxisBank();
		bankinfo.saving();
		bankinfo.fixed();
		bankinfo.deposit();
		axisbank.deposit();

	}

}