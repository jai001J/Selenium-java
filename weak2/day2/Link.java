package weak2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Link {

		public static void main(String[] args) {
		
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://leafground.com/pages/Link.html");
		    String attribute = driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href");
			System.out.println("The href value is " + attribute);
			driver.close();
			
		
		}

}