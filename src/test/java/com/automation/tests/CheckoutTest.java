package com.automation.tests;

import org.testng.annotations.Test;

public class CheckoutTest extends BaseTest {

	@Test
	public void verifyCheckoutFlow() {
		homePage.verifyHomePage();
		homePage.clickOnWomenSummerDressesMenu();

		productListingPage.clickQuickViewOfPrintedSummerDresses();
		productListingPage.selectSize();
		productListingPage.clickOnAddToCartBtn();
		productListingPage.clickOnContinueShopping();
		productListingPage.clickOnCheckoutBtn();

		cartPage.verifyPage();
		cartPage.clickOnProceedToCheckout();

		loginPage.enterEmail();
		loginPage.clickCreateAnAccountBtn();

		registrationPage.fillRequiredDetailsForNewUser();
		registrationPage.clickOnRegisterBtn();

		myAddressPage.clickOnProceedToCheckout();

		shippingPage.acceptTermsAndCondition();
		shippingPage.clickONProceedToCheckout();

		paymentPage.verifyPaymentPage();
	}

}
