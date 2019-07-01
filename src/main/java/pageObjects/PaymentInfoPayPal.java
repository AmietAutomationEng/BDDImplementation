package pageObjects;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaymentInfoPayPal {

	WebDriver driver;

	public PaymentInfoPayPal(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//*[text()='Credit Card']//following::div[@data-tl='checkout-page-payment-method-paypal']")
	WebElement paypalOption;

	@FindBy(xpath="//*[starts-with(@id,'zoid-paypal-button')]")
	WebElement paypalButton;

	@FindBy(id="email")
	WebElement paypalEmail;

	public void selectPaypalPaymentOption() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(paypalOption));		
		paypalOption.click();
	}

	public void processPaypalPaymentOption() throws InterruptedException {
		Thread.sleep(6000);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(paypalButton));
		((JavascriptExecutor) driver).executeScript( "arguments[0].scrollIntoView();", paypalButton);
		paypalButton.click();
	}

	public boolean verifyEmailTextBox() throws InterruptedException {
		Thread.sleep(5000);
		Set<String> windows = driver.getWindowHandles();
		for(String s:windows) {
			driver.switchTo().window(s);
		}
		return paypalEmail.isDisplayed();
	}
}
