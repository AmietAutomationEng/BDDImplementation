package appModulesActions;

import org.openqa.selenium.WebDriver;
import pageObjects.PaymentInfoPayPal;

public class PaymentInfoPayPalActions {
	
static PaymentInfoPayPal paymentPaypalDetails;
	
	public static void selectPayPalPaymentOption(WebDriver driver) throws InterruptedException {
		paymentPaypalDetails = new PaymentInfoPayPal(driver);
		paymentPaypalDetails.selectPaypalPaymentOption();
	}
	
	public static void processPayPalPaymentOption() throws InterruptedException {
		paymentPaypalDetails.processPaypalPaymentOption();
	}
	
	public static boolean verifyEmailTextBoxOnPayPalWindow() throws InterruptedException {
		return paymentPaypalDetails.verifyEmailTextBox();
	}
}