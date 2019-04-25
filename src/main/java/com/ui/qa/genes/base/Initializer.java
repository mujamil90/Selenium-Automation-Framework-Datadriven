package com.ui.qa.genes.base;

import java.awt.Robot;
import java.io.File;
import java.net.URI;

import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.ui.qa.genes.config.ZalandoConfigReader;
import com.ui.qa.genes.helpers.ElementActions;
import com.ui.qa.genes.helpers.JSExecutor;
import com.ui.qa.genes.pageobjects.Clothing;
import com.ui.qa.genes.pageobjects.HomePage;
import com.ui.qa.genes.pageobjects.Men;
import com.ui.qa.genes.pageobjects.SelectCountry;

/***
 * 
 * @author Muzzamil
 * 
 * This class is responsible to Initializes all global variables, Class objects and page objects.
 *
 */

public class Initializer {
	public static ZalandoConfigReader zalandoConfig = new ZalandoConfigReader();
	public static String WebsiteURL                 = zalandoConfig.getWebPortalUrl();
	public static String Browser                    = zalandoConfig.getBrowser();
	public static int    MaxPageLoadTime            = zalandoConfig.getTimeout();
	public static int    ImplicitlyWait             = zalandoConfig.getImplicitWait();
    public static String FS                         = File.separator;
    public static String OSName 	                = System.getProperty("os.name");
	public static String OSArchitecture             = System.getProperty("os.arch");
	public static String OSVersion                  = System.getProperty("os.version");
	public static String OSBit                      = System.getProperty("sun.arch.data.model");
	public static String ProjectWorkingDirectory    = System.getProperty("user.dir");
	public static String TestData                   = "./src/test/resources/TestData/";
	public static String Reports                 	= "./src/test/resources/Reports/";
	public static String reportImages            	= ProjectWorkingDirectory+"\\src\\test\\resources\\Reports\\Images\\";
	public static final String FILE_NAME         	= "Extent_Report.html";
	
	
	// classes refrences used in core framework	
	public static Robot re;
	public static Alert al;
	public static String robotImageName;
	public static Select se;
	public static String FileToUpload;
	public static Actions ac;
	public static SoftAssert softAssert;
	public static ITestResult result;
	public static URI uri;
	public static ExtentReports extent;
	public static ExtentTest test;	
	public static JSExecutor js;
    public static ElementActions elementActions;
    
   
    // Page Objects
    public static SelectCountry selectCountry = new SelectCountry();
    public static HomePage homePage           = new HomePage();
    public static Men men                     = new Men();
    public static Clothing clothing           = new Clothing();
}
