package com.automation.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverUtils {
	static WebDriver driver;
	
	public static void createDriver() {
		String browser = PropertyReader.getProperty("browser");
		System.out.println("Creating driver.....");
		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "driver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();

		} else {
			System.setProperty("webdriver.gecko.driver", "driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(PropertyReader.getProperty("url"));
	}

	public static void closeDriver() {
		driver.quit(); 	
	}
	
	public static WebDriver getDriver() {
		if (driver == null) {
			createDriver();
		}
		return driver;
	}
}
