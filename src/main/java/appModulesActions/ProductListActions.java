package appModulesActions;

import org.openqa.selenium.WebDriver;

import pageObjects.ProductsList;

public class ProductListActions {

	public static void selectFirstProduct(WebDriver driver) {
		ProductsList productlist = new ProductsList(driver);
		productlist.selectProduct();
	}
}
