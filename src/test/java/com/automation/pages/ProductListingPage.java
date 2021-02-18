package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.automation.utils.PropertyReader;

public class ProductListingPage extends BasePage {

	@FindBy(xpath = "//h5[@itemprop='name']//a[contains(text(),'Printed Summer Dress')]")
	WebElement printedSummerDressItem;

	@FindBy(xpath = "//ul[contains(@class,'product_list')]/li//a[@title='Printed Summer Dress']/..//span[text()='Quick view']")
	WebElement printedSummerDressQuickViewBtn;

	@FindBy(id = "group_1")
	WebElement sizeDropdownSelect;

	@FindBy(css = "#add_to_cart button")
	WebElement addToCartBtn;

	@FindBy(xpath = "//span[@title='Continue shopping']")
	WebElement continueShoppingBtn;

	@FindBy(xpath = "//div[@class='shopping_cart']/a")
	WebElement shoppingCartBtn;

	@FindBy(id = "button_order_cart")
	WebElement checkOutBtn;

	@FindBy(xpath = "//div[@id='center_column']//a[@title='Proceed to checkout']")
	WebElement proceedToCheckOutBtn;
	
	@FindBy(xpath = "//iframe[contains(@id,'fancybox')]")
	WebElement productDetailIframe;

	public void clickQuickViewOfPrintedSummerDresses() {
		utils.moveMouseToElement(printedSummerDressItem);
		printedSummerDressQuickViewBtn.click();
	}

	public void selectSize() {
		utils.waitForElementToBePresent(productDetailIframe);
		driver.switchTo().frame(productDetailIframe);
		Select sizeDropDown = new Select(sizeDropdownSelect);
		sizeDropDown.selectByVisibleText(PropertyReader.getProperty("size"));
		driver.switchTo().defaultContent();
	}

	public void clickOnAddToCartBtn() {
		driver.switchTo().frame(productDetailIframe);
		utils.waitForElementToBePresent(addToCartBtn);
		addToCartBtn.click();
	}

	public void clickOnContinueShopping() {
		utils.waitForElementToBePresent(continueShoppingBtn);
		continueShoppingBtn.click();
	}

	public void clickOnCheckoutBtn() {
		utils.moveMouseToElement(shoppingCartBtn);
		checkOutBtn.click();
	}

}
