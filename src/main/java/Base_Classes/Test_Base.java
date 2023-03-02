package Base_Classes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Base_Utility.Testutility;

public class Test_Base {
public static Logger Log = Logger.getLogger(Test_Base.class);
	
	
	public static WebDriver driver;
    public static Properties prop;
    
    public ExtentReports extent = new ExtentReports();
	public ExtentSparkReporter spark = new ExtentSparkReporter("test-output/ExtentReport.html");
	
	public  Test_Base() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\eclipse-workspace\\Pom\\src\\main\\java\\Base_config\\config.properties");
					
					
			prop.load(ip);
	 	}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
					
		} 
		
}
	public static void initialization() {
		Log.info("Browser Name :"+ prop.getProperty("browser"));
		String browserName =prop.getProperty("browser");
		if(browserName.equals("chrome")){
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	   driver = new ChromeDriver();
	   Log.info("app url:"+ prop.getProperty("url"));
		}
		
		driver.get(prop.getProperty("url"));
	   driver.manage().window().maximize();
	   driver.manage().deleteAllCookies();
	   //driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
	   driver.manage().timeouts().implicitlyWait(Testutility.IMPLICIT_WAIT,TimeUnit.SECONDS);
		
	}
}