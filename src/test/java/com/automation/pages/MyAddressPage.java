package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAddressPage extends BasePage {

	@FindBy(name = "processAddress")
	WebElement proceedToCheckOutBtn;

	public void clickOnProceedToCheckout() {
		utils.waitForElementToBePresent(proceedToCheckOutBtn);
		proceedToCheckOutBtn.click();
	}

}
