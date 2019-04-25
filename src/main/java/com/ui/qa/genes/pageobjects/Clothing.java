package com.ui.qa.genes.pageobjects;

import org.testng.Assert;

import com.ui.qa.genes.actions.DriverActions;

/***
 * 
 * @author Muzzamil
 *
 */
public class Clothing extends BasePageObject {

	public void verifyPageTitle(String expectedKeywords) {

		String pageTitle = DriverActions.getPageTitle();
		System.out.println(pageTitle);
		boolean isContains = org.apache.commons.lang3.StringUtils.containsIgnoreCase(pageTitle, expectedKeywords);
		Assert.assertTrue(isContains);

	}
}
