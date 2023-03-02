package BaseTestcase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base_Classes.Test_Base;
import Base_Pages.SignUp;


public class SignUptest extends Test_Base{
	public SignUp signup;

	public SignUptest() {
		super();
	}
	
	@BeforeMethod
		public void setUp() {
		initialization();
			signup = new SignUp();
		}
	@Test
	public void SignUptest() throws InterruptedException {
		signup.Signup(prop.getProperty("FirstName"),
				prop.getProperty("LastName"),
				prop.getProperty("Email"),
				prop.getProperty("ReEnterEmail"),
				prop.getProperty("newPass"),
				prop.getProperty("days"),
				prop.getProperty("months"),
				prop.getProperty("years"));
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}