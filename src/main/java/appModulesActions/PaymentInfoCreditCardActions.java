package appModulesActions;

import org.openqa.selenium.WebDriver;

import pageObjects.PaymentInfoCreditCard;

public class PaymentInfoCreditCardActions {
	
	static PaymentInfoCreditCard paymentDetails;
	
	public static void selectCreditCardOption(WebDriver driver) {
		paymentDetails = new PaymentInfoCreditCard(driver);
		paymentDetails.selectCreditCardAsPayment();
	}
	
	public static void enterPaymentInfo(String cardnumber, String expirationdate, String securitycode, String phonenumber) {
		paymentDetails.selectCreditCardAsPayment();
		paymentDetails.enterCardNumber(cardnumber);
		paymentDetails.enterExpirationDate(expirationdate);
		paymentDetails.enterSecurityCode(securitycode);
		paymentDetails.enterPhoneNumber(phonenumber);
	}
	
	public static String verifyInvalidCCErrorMessage() {
		return paymentDetails.verifyErrorMessage();
	}
}
