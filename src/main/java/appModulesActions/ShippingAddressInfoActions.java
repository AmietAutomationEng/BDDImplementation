package appModulesActions;

import org.openqa.selenium.WebDriver;

import pageObjects.ShippingAddressInfo;

public class ShippingAddressInfoActions {
	
	public static void enterShippingAddressInfo(WebDriver driver, String firstname, String lastname, String streetaddress, String cityname, String postalcode, String state ) {
		ShippingAddressInfo enteraddress = new ShippingAddressInfo(driver);
		enteraddress.enterFirstName(firstname);
		enteraddress.enterLastName(lastname);
		enteraddress.enterStreetAddress(streetaddress);
		enteraddress.enterCity(cityname);
		enteraddress.enterPostalCode(postalcode);
		enteraddress.selectState(state);
	}
}
