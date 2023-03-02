package BaseTestcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base_Classes.Test_Base;
import Base_Pages.Homepage;
import Base_Pages.Loginpage;

//@Listeners(comFBListener.MyListener.class)
public class Loginpagetest extends Test_Base{
	Loginpage loginPage;
	Homepage homepage;

	public Loginpagetest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		loginPage = new Loginpage();

	}

	@Test(priority = 1)
	public void loginTest() {

		homepage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown() {

	}
}