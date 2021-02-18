package com.automation.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.automation.pages.BasePage;
import com.automation.pages.CartPage;
import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import com.automation.pages.MyAddressPage;
import com.automation.pages.PaymentPage;
import com.automation.pages.ProductListingPage;
import com.automation.pages.RegistrationPage;
import com.automation.pages.ShippingPage;
import com.automation.utils.DriverUtils;
import com.automation.utils.PropertyReader;

public class BaseTest {

	HomePage homePage;
	ProductListingPage productListingPage;
	CartPage cartPage;
	LoginPage loginPage;
	RegistrationPage registrationPage;
	MyAddressPage myAddressPage;
	ShippingPage shippingPage;
	PaymentPage paymentPage;

	@BeforeTest
	public void setUp() {
		PropertyReader.initProperties();
		DriverUtils.createDriver();
		BasePage.setDriver(DriverUtils.getDriver());
		initPageObject();
	}

	@AfterTest
	public void cleanUp() {
		DriverUtils.closeDriver();
	}

	public void initPageObject() {
		homePage = new HomePage();
		productListingPage = new ProductListingPage();
		cartPage = new CartPage();
		loginPage = new LoginPage();
		registrationPage = new RegistrationPage();
		myAddressPage = new MyAddressPage();
		shippingPage = new ShippingPage();
		paymentPage = new PaymentPage();
	}
}
