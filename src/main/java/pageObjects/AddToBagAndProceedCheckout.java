package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToBagAndProceedCheckout {
	
	WebDriver driver;

	public AddToBagAndProceedCheckout(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@class='qa-product-size-and-quantity product-size-and-quantity __045a9 ember-view']//*[@class='caret']") 
	WebElement sizeOptionSymbol;

	@FindBy(xpath = "//ul[@class='dropdown-menu']/li") 
	List<WebElement> sizeList;

	@FindBy(name = "addToBag") 
	WebElement addToBag;
	
	@FindBy(name = "viewBag") 
	WebElement proceedCheckout;
	
	@FindBy(xpath = "//*[text()='PROCEED TO CHECKOUT' and @data-tl='proceed-to-checkout']") 
	WebElement checkout;
	
	public void clicksizeOptionSymbol() {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(sizeOptionSymbol));
		sizeOptionSymbol.click();
	}

	public void selectSize(String size) {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(sizeList.get(0)));
		
		for (int i=1;i<sizeList.size();i++){
			if (sizeList.get(i).getText().contains(size)) {
				sizeList.get(i).click();
				break;
			}
		}
	}
	
	public void clickAddToBagButton() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(addToBag));
		addToBag.click();
	}

	public void clickCheckoutButton() {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(proceedCheckout));
		proceedCheckout.click();
	}
	
	public void clickProceedCheckoutButton() {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(checkout));
		checkout.click();
	}
}
