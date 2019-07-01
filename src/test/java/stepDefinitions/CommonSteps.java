package stepDefinitions;

import java.io.IOException;
import java.sql.SQLException;

import org.openqa.selenium.WebDriver;

import appModulesActions.AddToBagAndProceedCheckoutActions;
import appModulesActions.HomePageSearchProductActions;
import appModulesActions.ProductListActions;
import appModulesActions.ShippingAddressInfoActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.CommonFunctions;

public class CommonSteps extends DriverController {
	
	WebDriver driver = getDriver();
	
	@Given("^User is on AEO site http://www\\.ae\\.com$")
	public void user_is_on_AEO_site_http_www_ae_com() throws IOException{
		  CommonFunctions.launchBrowser(CommonFunctions.readPropertiesFile("url"),driver);
	}

	@When("^User searches for a product$")
	public void user_searches_for_a_product() throws IOException, SQLException{
		try {
			HomePageSearchProductActions.searchYourProduct(driver, CommonFunctions.readPropertiesFile("productToBeSearched"));
		}	
		catch(Exception HomePageException)
		{
			System.out.println("Test case is failed on home page with Exception: " + HomePageException);
			CommonFunctions.closeApplication(driver);
		}
	}

	@When("^User choose to select the first product$")
	public void user_choose_to_select_the_first_product() throws IOException, SQLException{
		try {
			ProductListActions.selectFirstProduct(driver);
		}	
		catch(Exception ProductListException)
		{
			System.out.println("Test case is failed while selecting a product from product listing with Exception: " + ProductListException);
			CommonFunctions.closeApplication(driver);
		}
	}

	@When("^User selects the size of the product$")
	public void user_selects_the_size_of_the_product() throws IOException, SQLException{
		try {
			AddToBagAndProceedCheckoutActions.selectSize(driver, CommonFunctions.readPropertiesFile("sizeToBeSelected"));
		}	
		catch(Exception SizeOptionException)
		{
			System.out.println("Test case is failed while choosing the size of the product with Exception: " + SizeOptionException);
			CommonFunctions.closeApplication(driver);
		}
	}

	@When("^User adds the product to the bag$")
	public void user_adds_the_product_to_the_bag() throws IOException, SQLException{
		try {
			AddToBagAndProceedCheckoutActions.addProductToBag();
		}	
		catch(Exception AddToBagException)
		{
			System.out.println("Test case is failed on add to bag section with Exception: " + AddToBagException);
			CommonFunctions.closeApplication(driver);
		} 
	}

	@When("^User procceds to checkout page$")
	public void user_procceds_to_checkout_page() throws IOException, SQLException{
		try {
			AddToBagAndProceedCheckoutActions.docheckout();
			AddToBagAndProceedCheckoutActions.proceedToCheckout();
		}	
		catch(Exception ProceedToCheckoutException)
		{
			System.out.println("Test case is failed while proceeding checkout with Exception: " + ProceedToCheckoutException);
			CommonFunctions.closeApplication(driver);
		} 
	}

	@When("^User enter shipping address info on checkout page$")
	public void user_enter_shipping_address_info_on_checkout_page() throws Throwable {
		try {
			ShippingAddressInfoActions.enterShippingAddressInfo(driver, CommonFunctions.readPropertiesFile("firstname"), CommonFunctions.readPropertiesFile("lastname"), CommonFunctions.readPropertiesFile("streetaddress"), CommonFunctions.readPropertiesFile("cityname"), CommonFunctions.readPropertiesFile("postalcode"), CommonFunctions.readPropertiesFile("state"));
		}	
		catch(Exception AddressInfoException)
		{
			System.out.println("Test case is failed while entering address information with Exception: " + AddressInfoException);
			CommonFunctions.closeApplication(driver);
		} 
	}
	
	@Then("^User closes the browser$")
	public void user_closes_the_browser() throws Throwable {
		CommonFunctions.closeApplication(driver);
	}

}
