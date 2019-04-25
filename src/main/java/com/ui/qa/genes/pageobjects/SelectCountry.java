package com.ui.qa.genes.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.ui.qa.genes.actions.DriverActions;
import com.ui.qa.genes.extentreport.ExtentReport;

/***
 * 
 * @author Muzzamil
 *
 */
public class SelectCountry extends BasePageObject {

	By Countries = By.cssSelector("ul.content_nav-wrapper.nav li a");

	public void selectCountryByCode(String countryCode) {

		List<WebElement> counytries = DriverActions.getListOfElements(Countries, "Countries");
		for (WebElement county : counytries) {
			String href = county.getAttribute("href");
			if (org.apache.commons.lang3.StringUtils.containsIgnoreCase(href, countryCode)) {
				county.click();
				ExtentReport.logInfo("Country for : " + countryCode + " is selected.");
				break;
			}
		}
	}
}
