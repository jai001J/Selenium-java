package weak3.day1;

public class Desktop {
	public void desktopsize() {
		System.out.println("Desktop top size is 19 inch");

	}

	public static void main(String[] args) {
		Computer computer = new Computer();
		Desktop desktop = new Desktop();
		computer.computerModel();
		desktop.desktopsize();

	}

}