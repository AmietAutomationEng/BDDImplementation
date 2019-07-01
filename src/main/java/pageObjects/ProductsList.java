package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsList {
	
	WebDriver driver;

	public ProductsList(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@class='results-list qa-results-list __6cafc ember-view']//a")
	List<WebElement> listedProduct;

	public void selectProduct() {
		if(listedProduct.size()>0) {
			listedProduct.get(0).click();
		}
		else {
			System.out.println("NO product to select");
		}
	}
}
