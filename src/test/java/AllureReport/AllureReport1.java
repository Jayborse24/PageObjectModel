package AllureReport;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.annotations.Test;

public class AllureReport1 {
	
		@Test
		public void validateLogin() {
			
			System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			Properties prop = new Properties();
			
			driver.manage().window().maximize();
			driver.get("http://www.facebook.com/");
			
			driver.findElement(By.name("phone number")).sendKeys(prop.getProperty("username"));
			driver.findElement(By.name("pass")).sendKeys(prop.getProperty("password"));
			driver.findElement(By.name("login")).click();
			
		}
		

	}