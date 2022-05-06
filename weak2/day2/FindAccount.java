package weak2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindAccount {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click(); 
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Find Accounts")).click();
		driver.findElement(By.xpath("(//input[@name='accountName'])[2]")).sendKeys("Credit Limited Account");
		driver.findElement(By.xpath("//button[contains(text(),'Find Accounts')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Credit Limited Account')]")).click();
		String accountName = driver.findElement(By.xpath("//span[contains(text(),'Credit Limited Account  (accountlimit150)')]")).getText();
		if(accountName.equalsIgnoreCase("Credit Limited Account (accountlimit150)"))
		{ 
			System.out.println("Account Name matches"); 
			} else 
			{
			System.out.println("Account Name does not match"); 
			} 
		String title = driver.getTitle();
		System.out.println("Title is " + title);
		driver.close();


	}
}