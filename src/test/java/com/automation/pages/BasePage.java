package com.automation.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.automation.utils.WebElementUtils;

public class BasePage {
	static WebDriver driver;
	static WebElementUtils utils;
	static Logger logger = LogManager.getLogger();

	public BasePage() {
		PageFactory.initElements(driver, this);
	}

	public static void setDriver(WebDriver driver) {
		BasePage.driver = driver;
		utils = new WebElementUtils();
	}
}
