/**
 * 
 */
package com.ui.qa.genes.factory;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/****
 * 
 * @author Muzzamil
 *
 * This class is responsible to provide driver instance.
 */
public class DriverFactory extends BrowserFactory {
	public static ThreadLocal<WebDriver> wd = new ThreadLocal<WebDriver>();
	public static String browser;
	public static String url;

	@BeforeSuite
	public void beforeMethod() throws Exception
	{
		System.out.println("Browser: " + Browser);
		System.out.println("WebsiteURL: " + WebsiteURL);
		new DriverFactory();
		WebDriver driver = DriverFactory.startBrowser(Browser);
		setWebDriver(driver);
	}

	public void setWebDriver(WebDriver driver) {
		wd.set(driver);
	}

	public static WebDriver getWebDriver() {
		return wd.get();
	}


	@AfterSuite(alwaysRun = true, enabled = true)
	public void afterMethod() throws Exception {
		
		getWebDriver().quit();
	}
}
