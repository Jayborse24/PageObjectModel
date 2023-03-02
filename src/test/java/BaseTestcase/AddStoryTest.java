package BaseTestcase;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Base_Pages.AddStory;
import Base_Classes.Test_Base;

public class AddStoryTest extends Test_Base {
	public AddStory FbPg;

	public AddStoryTest() {
		super();
	}
	
	@BeforeMethod
		public void setUp() {
		initialization();
			FbPg = new AddStory();
		}
	@Test
	public void FB_Addtest() throws InterruptedException, AWTException, IOException {
		FbPg.FB_Add_story(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}