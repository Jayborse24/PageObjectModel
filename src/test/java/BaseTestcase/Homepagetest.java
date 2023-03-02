package BaseTestcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base_Classes.Test_Base;
import Base_Pages.Homepage;
import Base_Pages.Loginpage;

public class Homepagetest extends Test_Base {
	Loginpage loginPage;
	Homepage homepage;
	public Homepagetest() {
		super();
		
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginPage = new Loginpage();
		homepage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
     @Test(priority = 2)
     public void searchingFacebook() throws InterruptedException {
    	 Thread.sleep(2000);
    	 homepage.serchFacebook(prop.getProperty("search"));
     }
    	  @Test(priority = 1)
    	  public void homebtn() throws InterruptedException {
    		  Thread.sleep(2000);
    		  homepage.homebutton();
    		   
     }
    	  @Test(priority = 3)
             public void namelink() throws InterruptedException {
    		  Thread.sleep(2000);
    		  homepage.profilelink();
    	  }
    	  @AfterMethod
    		public void tearDown() {
    		//driver.quit();

    		}	  
}