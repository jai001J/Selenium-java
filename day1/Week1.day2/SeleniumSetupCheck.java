package week1.day2;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumSetupCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			WebDriverManager.chromedriver().setup();

				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://leaftaps.com/opentaps/");
			}
		}


