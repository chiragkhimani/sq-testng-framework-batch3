package com.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	@FindBy(xpath = "//div[@id='block_top_menu']//a[text()='Women']")
	WebElement womenTab;

	@FindBy(xpath = "//ul[contains(@class,'submenu-container')]//ul//a[@title='Summer Dresses']")
	WebElement summerDressesTab;

	public void verifyHomePage() {
		logger.info("Home page verification successful");
		Assert.assertTrue("Home page is not loaded", utils.isDisplayed(womenTab));
	}

	public void clickOnWomenSummerDressesMenu() {
		utils.moveMouseToElement(womenTab);
		summerDressesTab.click();
	}

}
