package com.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPage extends BasePage {

	@FindBy(css = "#cart_summary .product-name a")
	WebElement productName;

	@FindBy(css = "#total_price_container")
	WebElement totalPrice;

	public void verifyPaymentPage() {
		Assert.assertTrue("Item is not present on payment page", utils.isDisplayed(productName));
		Assert.assertTrue("Price is not displayed on payment page", utils.isDisplayed(totalPrice));
		logger.info("Product on payment page has been verified");
	}
}
