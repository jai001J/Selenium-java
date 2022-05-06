package weak2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {
	public static void main(String[]args) {


		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("http://leafground.com/pages/checkbox.html");
        boolean selected = driver.findElement(By.xpath("//label[text()='Select the languages that you know?']/following::input")).isSelected();
		System.out.println("The checkbox is selected " +selected);
		boolean selected2 = driver.findElement(By.xpath("//label[text()='Confirm Selenium is checked']/following-sibling::input")).isSelected();
		System.out.println("The checkbox is not selected " + selected2);
      //	  driver.close();

	}
}