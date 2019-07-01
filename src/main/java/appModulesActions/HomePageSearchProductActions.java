package appModulesActions;

import org.openqa.selenium.WebDriver;

import pageObjects.HomePageSearchProducts;

public class HomePageSearchProductActions {
	
	public static void searchYourProduct(WebDriver driver, String productForSerach) throws InterruptedException {

		HomePageSearchProducts homepage = new HomePageSearchProducts(driver);
		homepage.clickOnSearchOption();
		homepage.enterProductToBeSearched(productForSerach);
		homepage.searchProduct();
	}
}
