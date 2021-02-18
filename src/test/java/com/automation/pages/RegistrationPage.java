package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.automation.utils.PropertyReader;

public class RegistrationPage extends BasePage {
	@FindBy(id = "uniform-id_gender1")
	WebElement genderMr;

	@FindBy(id = "customer_firstname")
	WebElement custFirstNameInput;

	@FindBy(id = "customer_lastname")
	WebElement custLastNameInput;

	@FindBy(id = "passwd")
	WebElement passwordInput;

	@FindBy(id = "days")
	WebElement dobDaysSelect;

	@FindBy(id = "months")
	WebElement dobMonthSelect;

	@FindBy(id = "years")
	WebElement dobYearSelect;

	@FindBy(id = "firstname")
	WebElement addressFirstNameInput;

	@FindBy(id = "lastname")
	WebElement addressLastNamInput;

	@FindBy(id = "address1")
	WebElement addressLine1Input;

	@FindBy(id = "city")
	WebElement cityInput;

	@FindBy(id = "id_state")
	WebElement stateSelect;

	@FindBy(id = "postcode")
	WebElement postCodeInput;

	@FindBy(id = "id_country")
	WebElement countryInput;

	@FindBy(id = "phone_mobile")
	WebElement phoneNumberInput;

	@FindBy(id = "submitAccount")
	WebElement registerBtn;

	public void fillRequiredDetailsForNewUser() {

		genderMr.click();

		custFirstNameInput.sendKeys(PropertyReader.getProperty("user.firstname"));
		custLastNameInput.sendKeys(PropertyReader.getProperty("user.lastname"));
		passwordInput.sendKeys(PropertyReader.getProperty("user.password"));

		Select dobDayDropdown = new Select(dobDaysSelect);
		dobDayDropdown.selectByValue(PropertyReader.getProperty("dob.day"));
		Select dobMonthDropdown = new Select(dobMonthSelect);
		dobMonthDropdown.selectByValue(PropertyReader.getProperty("dob.month"));
		Select dobYearDropdown = new Select(dobYearSelect);
		dobYearDropdown.selectByValue(PropertyReader.getProperty("dob.year"));

		addressFirstNameInput.sendKeys(PropertyReader.getProperty("user.firstname"));
		addressLastNamInput.sendKeys(PropertyReader.getProperty("user.lastname"));
		addressLine1Input.sendKeys(PropertyReader.getProperty("address.line"));
		Select stateDropdown = new Select(stateSelect);
		stateDropdown.selectByVisibleText(PropertyReader.getProperty("address.state"));

		cityInput.sendKeys(PropertyReader.getProperty("address.city"));
		postCodeInput.sendKeys(PropertyReader.getProperty("address.postal.code"));
		countryInput.sendKeys(PropertyReader.getProperty("address.country"));
		phoneNumberInput.sendKeys(PropertyReader.getProperty("user.phone.number"));
	}

	public void clickOnRegisterBtn() {
		registerBtn.click();
		logger.info("User registered successfully");
	}

}
