package weak2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NTCreatAccount {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.xpath("//input[@id='currencyUomId']")).sendKeys("INR - Indian Rupee");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("NRI Account");
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("GreenPark Complex");
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Group 1");
		driver.findElement(By.xpath("//input[@id='annualRevenue']")).sendKeys("10 lakhs");
		driver.findElement(By.xpath("//input[@id='ext-gen635']")).click();
		driver.close();

	}

}