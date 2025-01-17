package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactInfo {
	
WebDriver driver;
	
	public ContactInfo(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "email")
	WebElement email;
	
	public void enterEmail(String emailaddress) {
		email.sendKeys(emailaddress);
	}
}
