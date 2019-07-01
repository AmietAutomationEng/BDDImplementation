package appModulesActions;

import org.openqa.selenium.WebDriver;

import pageObjects.AddToBagAndProceedCheckout;

public class AddToBagAndProceedCheckoutActions {
	
	static AddToBagAndProceedCheckout addAndCheckout;
	
	public static void selectSize(WebDriver driver, String size) throws InterruptedException {
		addAndCheckout = new AddToBagAndProceedCheckout(driver);
		addAndCheckout.clicksizeOptionSymbol();
		addAndCheckout.selectSize(size);
	}
	
	public static void addProductToBag() throws InterruptedException {
		addAndCheckout.clickAddToBagButton();
	}
	
	public static void docheckout() {
		addAndCheckout.clickCheckoutButton();
	}
	
	public static void proceedToCheckout() {
		addAndCheckout.clickProceedCheckoutButton();
	}
}
