package com.automation.pages;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.utils.PropertyReader;

public class LoginPage extends BasePage {
	@FindBy(id = "email_create")
	WebElement emailInput;

	@FindBy(id = "SubmitCreate")
	WebElement createAccountBtn;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public void enterEmail() {
		Random random = new Random();
		String email = PropertyReader.getProperty("user.email").replaceAll("XXX", String.valueOf(random.nextInt(1000)));
		logger.info(email);
		utils.waitForElementToBePresent(emailInput);
		emailInput.sendKeys(email);
	}

	public void clickCreateAnAccountBtn() {
		createAccountBtn.click();
	}
}
