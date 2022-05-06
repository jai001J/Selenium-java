package weak2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreatAccount {
public static void main(String[]args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver =new ChromeDriver();
	
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Accounts")).click();
	driver.findElement(By.linkText("Create Account")).click();
	driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account");
	driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
	driver.findElement(By.id("groupNameLocal")).sendKeys("Test");
	driver.findElement(By.id("officeSiteName")).sendKeys("Testleaf");
	driver.findElement(By.xpath("//input[@id='annualRevenue']")).sendKeys("100000");
	driver.findElement(By.linkText("Create Account")).click();
	System.out.println("Account Created");
    driver.close();	
	
}
}