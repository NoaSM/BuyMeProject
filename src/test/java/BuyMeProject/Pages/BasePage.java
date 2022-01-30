package BuyMeProject.Pages;

import BuyMeProject.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePage {
    private static WebDriverWait wait;

    public void clickElement(By locator) throws Exception {
        getWebElement(locator).click();

    }
//    public void findElements(By locator) throws Exception{
//        List<WebElement> elements = getWebElement(locator).findElements(locator);
//        for(int i = 0; i < elements.size(); i++){
//            if(elements.get(i).getAttribute("autocomplete").equals("off")){
//                elements.get(i).click();
//            }
//        }
//    }


    public String sendKeysToElement(By locator, String text) throws Exception {
        getWebElement(locator).sendKeys(text);
        return text;
    }
//    public String getWebURL(String text) throws Exception {
//        return Singleton.getDriverInstance().getCurrentUrl();
//
//    }
//    public By Assertion(By locator) {
//        getWebElement(locator).getText();
//        //Assert.assertEquals(text , locator);
//        return locator;
//    }
    public String findElement(By locator, String text) throws Exception {
        getWebElement(locator).sendKeys(text);
        return text;
    }

    public void SelectFromList(By locator) throws Exception {
        Select mySelection = new Select(getWebElement(locator));
        mySelection.selectByVisibleText("");

    }
    public void assertEquals(By locator, String text){

        //Assert.assertEquals(text , getWebElement(locator).sendKeys(text));
    }


    private WebElement getWebElement(By locator) throws Exception {
        return Singleton.getDriverInstance().findElement(locator);
    }

}

