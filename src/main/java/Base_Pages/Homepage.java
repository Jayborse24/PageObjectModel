package Base_Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_Classes.Test_Base;

public class Homepage extends Test_Base{
	@FindBy(xpath = "//input[contains(@class,'x1i10hfl')][1]")
	WebElement serch;
	
	@FindBy(xpath = "//a[@aria-label='Home']")
	WebElement home;
     @FindBy(xpath="//span[contains(text(),'Bhushan Borse')]")
 	WebElement profile ;
	// initializing page object
	public Homepage() {
		PageFactory.initElements(driver, this);
	}

	// actions
	public void serchFacebook(String serching) {
		serch.sendKeys(serching,Keys.ENTER);
	}
	public void homebutton() {
		home.click();
	}
	public void profilelink() {
		profile.click();
	}
}
