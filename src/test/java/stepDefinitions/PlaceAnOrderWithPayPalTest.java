package stepDefinitions;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import appModulesActions.ContactInfoActions;
import appModulesActions.PaymentInfoPayPalActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.CommonFunctions;

public class PlaceAnOrderWithPayPalTest extends DriverController {

	WebDriver driver = getDriver();

	@When("^User selects payment method as PayPal$")
	public void user_selects_payment_method_as_PayPal() throws InterruptedException {

		try {
			PaymentInfoPayPalActions.selectPayPalPaymentOption(driver);	
		}	
		catch(Exception SelectPPException)
		{
			System.out.println("Test case is failed while selecting the paypal as payment option with Exception: " + SelectPPException);
			CommonFunctions.closeApplication(driver);
		}

	}

	@When("^User enters email address under contact info$")
	public void user_enters_email_address_under_contact_info() throws IOException {
		try {
			ContactInfoActions.enterContactInfo(driver, CommonFunctions.readPropertiesFile("emailaddress"));
		}	
		catch(Exception ContactEmailException)
		{
			System.out.println("Test case is failed while entring email address with Exception: " + ContactEmailException);
			CommonFunctions.closeApplication(driver);
		}
	}

	@When("^User clicks the PayPal button to process a order$")
	public void user_clicks_the_PayPal_button_to_process_a_order() throws IOException, InterruptedException {
		
		try {
			PaymentInfoPayPalActions.processPayPalPaymentOption();
		}	
		catch(Exception processwithPaypalException)
		{
			System.out.println("Test case is failed while processing the paypal payment with Exception: " + processwithPaypalException);
			CommonFunctions.closeApplication(driver);
		}
	}

	@Then("^User should be displayed with paypal payment window$")
	public void user_should_be_displayed_with_paypal_payment_window() throws IOException, InterruptedException {
		Assert.assertTrue(PaymentInfoPayPalActions.verifyEmailTextBoxOnPayPalWindow());
	}
}
