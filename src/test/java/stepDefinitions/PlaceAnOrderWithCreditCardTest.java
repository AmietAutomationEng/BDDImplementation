package stepDefinitions;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import appModulesActions.PaymentInfoCreditCardActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.CommonFunctions;

public class PlaceAnOrderWithCreditCardTest extends DriverController{
	
	WebDriver driver = getDriver();
	
	@When("^User selects Credit Card as payment option$")
	public void user_selects_Credit_Card_as_payment_option(){
		
	    try {
	    	PaymentInfoCreditCardActions.selectCreditCardOption(driver);	
	    }	
		catch(Exception SelectCCException)
		{
			System.out.println("Test case is failed while selecting the credit card with Exception: " + SelectCCException);
			CommonFunctions.closeApplication(driver);
		}
	}
	
	@When("^User enters credit card information as creditCardNumber \"([^\"]*)\" and expirationDate \"([^\"]*)\" and securityCode \"([^\"]*)\" and phoneNumber \"([^\"]*)\"$")
	public void user_enters_credit_card_information_as_creditCardNumber_and_expirationDtae_and_securitycode_and_phonenumber(String creditCardNumber, String expirationDate, String securityCode, String phoneNumber) {
		try {
			PaymentInfoCreditCardActions.enterPaymentInfo(creditCardNumber, expirationDate, securityCode, phoneNumber);
		}
		catch(Exception CCInfoException)
		{
			System.out.println("Test case is failed while entering credit card information with Exception: " + CCInfoException);
			CommonFunctions.closeApplication(driver);
		}		
	}

	@Then("^User should be displayed with an error message$")
	public void user_should_be_displayed_with_an_error_message() throws IOException {
		try {
			Assert.assertTrue(CommonFunctions.readPropertiesFile("invalidCCnumberErroeMessage").equals(PaymentInfoCreditCardActions.verifyInvalidCCErrorMessage()));
		}
		catch(Exception CCErrorException)
		{
			System.out.println("Test case is failed while validating invalid credit card error with Exception: " + CCErrorException);
			CommonFunctions.closeApplication(driver);
		}	
	}
}
