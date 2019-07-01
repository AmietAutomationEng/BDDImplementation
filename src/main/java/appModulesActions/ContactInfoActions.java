package appModulesActions;

import org.openqa.selenium.WebDriver;

import pageObjects.ContactInfo;

public class ContactInfoActions {
	
	public static void enterContactInfo(WebDriver driver, String emailaddress) {
		ContactInfo contactinfo = new ContactInfo(driver);
		contactinfo.enterEmail(emailaddress);
	}
}
