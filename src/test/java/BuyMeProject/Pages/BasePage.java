package BuyMeProject.Pages;

import BuyMeProject.Singleton;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;



public class BasePage {


    public void clickElement(By locator) throws Exception {
        Singleton.wait.until(ExpectedConditions.elementToBeClickable(locator));
        getWebElement(locator).click();


    }

    public String sendKeysToElement(By locator, String text) throws Exception {
        //Singleton.wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        getWebElement(locator).sendKeys(text);
        return text;
    }
    public String getElement(By locator) throws Exception{
        return getWebElement(locator).getText();
    }

    private WebElement getWebElement(By locator) throws Exception {
        return Singleton.getDriverInstance().findElement(locator);
    }

}

