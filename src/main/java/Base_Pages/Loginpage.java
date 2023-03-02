package Base_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_Classes.Test_Base;

public class Loginpage extends Test_Base{
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(name="pass")
	WebElement password;
	
	@FindBy(name="login")
	WebElement loginBotton;
	
	@FindBy(xpath="//img[@alt='Facebook']")
	WebElement facebookLogo;

	@FindBy(xpath="//div[@class='_6ltj']")
	WebElement forgetpassword;
	
	@FindBy(xpath="//a[contains(text(),'Create a Page')]")
	WebElement createAPage;
	
//initializing page object
public Loginpage () {
	PageFactory.initElements(driver,this);
}
//actions
		public Homepage login(String un,String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBotton.click();
		return  new Homepage(); 
 
		}
		public String verifyLoginPageTitle() {
			// TODO Auto-generated method stub
			return null;
		}
}