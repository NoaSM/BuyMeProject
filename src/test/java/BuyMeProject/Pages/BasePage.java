package BuyMeProject.Pages;

import BuyMeProject.Singleton;
import com.aventstack.extentreports.MediaEntityBuilder;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import static BuyMeProject.Pages.MainTest.test;

public class BasePage {
    //private static WebDriverWait wait;

    public void clickElement(By locator) throws Exception {
            getWebElement(locator).click();

    }

    public String sendKeysToElement(By locator, String text) throws Exception {
        getWebElement(locator).sendKeys(text);
        return text;
    }

    private WebElement getWebElement(By locator) throws Exception {
        return Singleton.getDriverInstance().findElement(locator);
    }

}

