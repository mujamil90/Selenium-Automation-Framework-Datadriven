package com.ui.qa.genes.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.ui.qa.genes.actions.DriverActions;
import com.ui.qa.genes.extentreport.ExtentReport;

/***
 * 
 * @author Muzzamil
 * 
 * This is Base page object having all common locators and function of Application under Test.
 *
 */
public class BasePageObject extends ExtentReport {

	By navigationMenuGenderSplit = By.cssSelector("div.z-navicat-header_genderSplit>a>span");
	By navigationCategoryList    = By.cssSelector("ul.z-navicat-header_categoryList a>span");

	public void verifyCurrentPage(String matchingText) {

		String url = DriverActions.getCurrentPageUrl();
		boolean isContains=org.apache.commons.lang3.StringUtils.containsIgnoreCase(url, matchingText);
		Assert.assertTrue(isContains, "Opened page is wrong.");

	}

	public void selectGenderBasedCategory(String category) {
		selectCategory(navigationMenuGenderSplit, category);
	}

	public void selectCategory(String category) {
		selectCategory(navigationCategoryList, category);
	}

	private void selectCategory(By by, String category) {

		List<WebElement> categories = DriverActions.getListOfElements(by, "Category List");

		for (WebElement iCategory : categories) {
			String categoryName = iCategory.getText();
			if (org.apache.commons.lang3.StringUtils.containsIgnoreCase(categoryName, category)) {
				iCategory.click();
				break;

			}
		}

	}

}
