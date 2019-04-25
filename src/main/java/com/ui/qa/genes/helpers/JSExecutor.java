package com.ui.qa.genes.helpers;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ui.qa.genes.factory.DriverFactory;

/**
 * @author Muzzamil
 * 
 * Factory for Javascript TestRunner methods.
 */
public class JSExecutor extends DriverFactory{
    private WebDriver driver;

    public JSExecutor(WebDriver driver) {
        this.driver = driver;
    }

    public void scrollIntoElement(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void waitUntilDocIsReady() {
        new WebDriverWait(driver, MaxPageLoadTime).until((ExpectedCondition<Boolean>) wd ->
                ((JavascriptExecutor) wd).executeScript("return document.readyState;").equals("complete"));
    }

    public boolean hasPageTransition() {
        this.waitUntilDocIsReady();
        return ((JavascriptExecutor)driver).executeScript("return document.readyState;").equals("complete");
    }
    
    public void click(WebElement element) {
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
    }

    public void clickAtPointX(WebElement element) {
        ((JavascriptExecutor)driver).executeScript("window.scrollTo(0,"+ element.getLocation().x +")");
        element.click();
    }

    public void clickAtPointY(WebElement element) {
        ((JavascriptExecutor)driver).executeScript("window.scrollTo(0,"+ element.getLocation().y +")");
        element.click();
    }
}
