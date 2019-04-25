package com.ui.qa.genes.HomePage;

import org.testng.annotations.Test;

import com.ui.qa.genes.extentreport.ExtentReport;

public class HomePageTest extends ExtentReport {

	@Test
	public void testSelectGenderBasedCategory() {

		String GenderBasedCategoryMen = prop.getProperty("GenderBasedCategoryMen");

		homePage.selectGenderBasedCategory(GenderBasedCategoryMen);
		men.verifyCurrentPage(GenderBasedCategoryMen);

	}

	@Test
	public void testSelectCategory() {

		String categoryType = prop.getProperty("CategoryType");

		homePage.selectCategory(categoryType);
		clothing.verifyCurrentPage(categoryType);

	}

}
