package weak2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Image {
	public static void mani(String[]args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("http://leafground.com/pages/Image.html");
        driver.findElement(By.xpath("//label[@for='home']")).click();
        driver.findElement(By.xpath("//label[@for='position']")).click();
        driver.close();
    	
	}

}