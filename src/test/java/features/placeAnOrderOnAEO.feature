Feature: Test AEO Place Order Function

	Background:
	Given User is on AEO site http://www.ae.com
	When User searches for a product
	And User choose to select the first product
	And User selects the size of the product
	And User adds the product to the bag
	And User procceds to checkout page
	And User enter shipping address info on checkout page
	
	Scenario Outline: Verify place an order business function on AEO using invalid CreditCard
	And User selects Credit Card as payment option
	And User enters credit card information as creditCardNumber "<creditCardNumber>" and expirationDate "<expirationDate>" and securityCode "<securityCode>" and phoneNumber "<phoneNumber>"
	Then User should be displayed with an error message

	Examples: 
      | creditCardNumber |  expirationDate | securityCode | phoneNumber |
      | 411111111111111  |  1219           | 989          | 4126944668  | 
      

	Scenario: Verify place an order business function on AEO using PayPal
	And User selects payment method as PayPal
	And User enters email address under contact info
	And User clicks the PayPal button to process a order
	Then User should be displayed with paypal payment window
	Then User closes the browser