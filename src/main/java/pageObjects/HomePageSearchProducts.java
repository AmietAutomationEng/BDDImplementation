package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageSearchProducts {
	WebDriver driver;

	public HomePageSearchProducts(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[text()='Search']") 
	private WebElement searchOption;

	@FindBy(name = "search") 
	private WebElement searchTextBox;

	@FindBy(xpath = "//*[@class='btn btn-link search-btn']") 
	private WebElement searchButton;


	public void clickOnSearchOption() {
		searchOption.click();
	}

	public void enterProductToBeSearched(String product) {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(searchTextBox));
		searchTextBox.sendKeys(product);
	}
	
	public void searchProduct() {
		searchButton.click();
	}
}
