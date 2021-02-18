package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShippingPage extends BasePage {

	@FindBy(name = "processCarrier")
	WebElement proceedToCheckOutBtn;

	@FindBy(id = "cgv")
	WebElement termsAndConditionCheckBox;

	public void acceptTermsAndCondition() {
		utils.waitForElementToBePresent(proceedToCheckOutBtn);
		termsAndConditionCheckBox.click();
	}

	public void clickONProceedToCheckout() {
		proceedToCheckOutBtn.click();
	}

}
