package com.automation.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementUtils {

	WebDriverWait wait = new WebDriverWait(DriverUtils.getDriver(),
			Long.parseLong(PropertyReader.getProperty("timeout")));

	public void waitForElementToBePresent(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void waitForElementToBeClickable(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public boolean isDisplayed(WebElement element) {
		try {
			element.isDisplayed();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void moveMouseToElement(WebElement element) {
		Actions action = new Actions(DriverUtils.getDriver());
		action.moveToElement(element).build().perform();
	}
}
