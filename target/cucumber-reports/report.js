$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("placeAnOrderOnAEO.feature");
formatter.feature({
  "line": 1,
  "name": "Test AEO Place Order Function",
  "description": "",
  "id": "test-aeo-place-order-function",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 12,
  "name": "Verify place an order business function on AEO using invalid CreditCard",
  "description": "",
  "id": "test-aeo-place-order-function;verify-place-an-order-business-function-on-aeo-using-invalid-creditcard",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 13,
  "name": "User selects Credit Card as payment option",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User enters credit card information as creditCardNumber \"\u003ccreditCardNumber\u003e\" and expirationDate \"\u003cexpirationDate\u003e\" and securityCode \"\u003csecurityCode\u003e\" and phoneNumber \"\u003cphoneNumber\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User should be displayed with an error message",
  "keyword": "Then "
});
formatter.examples({
  "line": 17,
  "name": "",
  "description": "",
  "id": "test-aeo-place-order-function;verify-place-an-order-business-function-on-aeo-using-invalid-creditcard;",
  "rows": [
    {
      "cells": [
        "creditCardNumber",
        "expirationDate",
        "securityCode",
        "phoneNumber"
      ],
      "line": 18,
      "id": "test-aeo-place-order-function;verify-place-an-order-business-function-on-aeo-using-invalid-creditcard;;1"
    },
    {
      "cells": [
        "411111111111111",
        "1219",
        "989",
        "4126944668"
      ],
      "line": 19,
      "id": "test-aeo-place-order-function;verify-place-an-order-business-function-on-aeo-using-invalid-creditcard;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User is on AEO site http://www.ae.com",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User searches for a product",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User choose to select the first product",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User selects the size of the product",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User adds the product to the bag",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User procceds to checkout page",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User enter shipping address info on checkout page",
  "keyword": "And "
});
formatter.match({
  "location": "CommonSteps.user_is_on_AEO_site_http_www_ae_com()"
});
formatter.result({
  "duration": 40959142800,
  "status": "passed"
});
formatter.match({
  "location": "CommonSteps.user_searches_for_a_product()"
});
formatter.result({
  "duration": 4136670300,
  "status": "passed"
});
formatter.match({
  "location": "CommonSteps.user_choose_to_select_the_first_product()"
});
formatter.result({
  "duration": 2723395600,
  "status": "passed"
});
formatter.match({
  "location": "CommonSteps.user_selects_the_size_of_the_product()"
});
formatter.result({
  "duration": 5293092800,
  "status": "passed"
});
formatter.match({
  "location": "CommonSteps.user_adds_the_product_to_the_bag()"
});
formatter.result({
  "duration": 2304198800,
  "status": "passed"
});
formatter.match({
  "location": "CommonSteps.user_procceds_to_checkout_page()"
});
formatter.result({
  "duration": 4211680500,
  "status": "passed"
});
formatter.match({
  "location": "CommonSteps.user_enter_shipping_address_info_on_checkout_page()"
});
formatter.result({
  "duration": 4116711700,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Verify place an order business function on AEO using invalid CreditCard",
  "description": "",
  "id": "test-aeo-place-order-function;verify-place-an-order-business-function-on-aeo-using-invalid-creditcard;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 13,
  "name": "User selects Credit Card as payment option",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User enters credit card information as creditCardNumber \"411111111111111\" and expirationDate \"1219\" and securityCode \"989\" and phoneNumber \"4126944668\"",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User should be displayed with an error message",
  "keyword": "Then "
});
formatter.match({
  "location": "PlaceAnOrderWithCreditCardTest.user_selects_Credit_Card_as_payment_option()"
});
formatter.result({
  "duration": 289370500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "411111111111111",
      "offset": 57
    },
    {
      "val": "1219",
      "offset": 94
    },
    {
      "val": "989",
      "offset": 118
    },
    {
      "val": "4126944668",
      "offset": 140
    }
  ],
  "location": "PlaceAnOrderWithCreditCardTest.user_enters_credit_card_information_as_creditCardNumber_and_expirationDtae_and_securitycode_and_phonenumber(String,String,String,String)"
});
formatter.result({
  "duration": 1736028800,
  "status": "passed"
});
formatter.match({
  "location": "PlaceAnOrderWithCreditCardTest.user_should_be_displayed_with_an_error_message()"
});
formatter.result({
  "duration": 82923700,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User is on AEO site http://www.ae.com",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User searches for a product",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User choose to select the first product",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User selects the size of the product",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User adds the product to the bag",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User procceds to checkout page",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User enter shipping address info on checkout page",
  "keyword": "And "
});
formatter.match({
  "location": "CommonSteps.user_is_on_AEO_site_http_www_ae_com()"
});
formatter.result({
  "duration": 6341326800,
  "status": "passed"
});
formatter.match({
  "location": "CommonSteps.user_searches_for_a_product()"
});
formatter.result({
  "duration": 1409358900,
  "status": "passed"
});
formatter.match({
  "location": "CommonSteps.user_choose_to_select_the_first_product()"
});
formatter.result({
  "duration": 2240335700,
  "status": "passed"
});
formatter.match({
  "location": "CommonSteps.user_selects_the_size_of_the_product()"
});
formatter.result({
  "duration": 4358137600,
  "status": "passed"
});
formatter.match({
  "location": "CommonSteps.user_adds_the_product_to_the_bag()"
});
formatter.result({
  "duration": 2236122400,
  "status": "passed"
});
formatter.match({
  "location": "CommonSteps.user_procceds_to_checkout_page()"
});
formatter.result({
  "duration": 4144437300,
  "status": "passed"
});
formatter.match({
  "location": "CommonSteps.user_enter_shipping_address_info_on_checkout_page()"
});
formatter.result({
  "duration": 4172683900,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Verify place an order business function on AEO using PayPal",
  "description": "",
  "id": "test-aeo-place-order-function;verify-place-an-order-business-function-on-aeo-using-paypal",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 23,
  "name": "User selects payment method as PayPal",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User enters email address under contact info",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User clicks the PayPal button to process a order",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "User should be displayed with paypal payment window",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "User closes the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "PlaceAnOrderWithPayPalTest.user_selects_payment_method_as_PayPal()"
});
formatter.result({
  "duration": 2287596400,
  "status": "passed"
});
formatter.match({
  "location": "PlaceAnOrderWithPayPalTest.user_enters_email_address_under_contact_info()"
});
formatter.result({
  "duration": 1358854000,
  "status": "passed"
});
formatter.match({
  "location": "PlaceAnOrderWithPayPalTest.user_clicks_the_PayPal_button_to_process_a_order()"
});
formatter.result({
  "duration": 6520135200,
  "status": "passed"
});
formatter.match({
  "location": "PlaceAnOrderWithPayPalTest.user_should_be_displayed_with_paypal_payment_window()"
});
formatter.result({
  "duration": 6212849000,
  "status": "passed"
});
formatter.match({
  "location": "CommonSteps.user_closes_the_browser()"
});
formatter.result({
  "duration": 1468877600,
  "status": "passed"
});
});