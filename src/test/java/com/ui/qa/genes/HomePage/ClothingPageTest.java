package com.ui.qa.genes.HomePage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ui.qa.genes.extentreport.ExtentReport;

public class ClothingPageTest extends ExtentReport {

	@BeforeMethod
	public void setUp() {
		String categoryType = prop.getProperty("CategoryType");
		homePage.selectCategory(categoryType);

	}

	@Test
	public void testClothingPageTitle() {
		String categoryType = prop.getProperty("CategoryType");
		clothing.verifyPageTitle(categoryType);

	}
}
