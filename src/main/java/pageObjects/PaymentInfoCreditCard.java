package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaymentInfoCreditCard {
	
	WebDriver driver;
	
	
	public PaymentInfoCreditCard(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(xpath="//*[text()='Credit Card']")
	WebElement creditCardOption;
	
	@FindBy(name="cardNumber")
	WebElement cardNumber;
	
	@FindBy(name="expirationDate")
	WebElement expirationDate;
	
	@FindBy(name="securityCode")
	WebElement securityCode;
	
	@FindBy(name ="phoneNumber")
	WebElement phoneNumber;
	
	@FindBy(name = "email")
	WebElement email;
	
	@FindBy(name="place-order")
	WebElement placeOrder;
	
	@FindBy(xpath = "//*[@name='cardNumber']/following::div[starts-with(@data-label-code,'error.checkout')]")               
	WebElement errorTextInvalidCCNumber;
		
	public void selectCreditCardAsPayment() {
		creditCardOption.click();
	}
	
	public void enterCardNumber(String cardnumber) {
		cardNumber.sendKeys(cardnumber);
	}
	
	public void enterExpirationDate(String expirationdate) {
		expirationDate.sendKeys(expirationdate);
	}
	
	public void enterSecurityCode(String securitycode) {
		securityCode.sendKeys(securitycode);
	}
	
	public void enterPhoneNumber(String phonenumber) {
		phoneNumber.sendKeys(phonenumber);
	}
	
	public void enterEmail(String emailaddress) {
		email.sendKeys(emailaddress);
	}
	
	public String verifyErrorMessage() {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(errorTextInvalidCCNumber));
		 return errorTextInvalidCCNumber.getText();
	}
}
