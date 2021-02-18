package com.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {

	@FindBy(css = "#cart_summary .product-name")
	WebElement cartItem;

	@FindBy(xpath = "//div[@id='center_column']//a[@title='Proceed to checkout']")
	WebElement proceedToCheckoutBtn;

	public void clickOnProceedToCheckout() {
		utils.waitForElementToBePresent(proceedToCheckoutBtn);
		proceedToCheckoutBtn.click();
	}

	public void verifyPage() {
		logger.info("Cart page verification is successful");
		Assert.assertTrue("Item is not added into the cart", utils.isDisplayed(cartItem));
	}

}
