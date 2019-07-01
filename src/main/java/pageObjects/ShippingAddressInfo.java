package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ShippingAddressInfo {
	
	WebDriver driver;
	
	public ShippingAddressInfo(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="firstname")
	WebElement firstName;
	
	@FindBy(name="lastname")
	WebElement lasttName;
	
	@FindBy(name="streetAddress")
	WebElement streetAddress;
	
	@FindBy(name="city")
	WebElement city;
	
	@FindBy(name="postalCode")
	WebElement postalCode;
	
	@FindBy(name="states")
	WebElement states;
	
	
	public void enterFirstName(String firstname) {		
		firstName.clear();
		firstName.sendKeys(firstname);
	}
	
	public void enterLastName(String lastname) {
		lasttName.clear();
		lasttName.sendKeys(lastname);
	}
	
	public void enterStreetAddress(String streetaddress) {	
		streetAddress.clear();
		streetAddress.sendKeys(streetaddress);
	}
	
	public void enterCity(String cityname) {
		city.clear();
		city.sendKeys(cityname);
	}
	
	public void enterPostalCode(String postalcode) {
		postalCode.clear();
		postalCode.sendKeys(postalcode);
	}
	
	public void selectState(String state) {
		Select sel = new Select(states);		
		sel.selectByValue(state);
	}
}





			

