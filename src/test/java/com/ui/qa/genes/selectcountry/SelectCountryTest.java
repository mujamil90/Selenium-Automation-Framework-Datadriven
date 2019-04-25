package com.ui.qa.genes.selectcountry;

import org.testng.annotations.Test;

import com.ui.qa.genes.extentreport.ExtentReport;

public class SelectCountryTest extends ExtentReport {

	@Test
	public void testSelectCountry() {

		String country = prop.getProperty("Select_Country_Code_UK");

		selectCountry.selectCountryByCode(country);
		homePage.verifyCurrentPage(country);

	}

}
