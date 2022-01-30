package BuyMeProject.Pages;

import BuyMeProject.Singleton;
import org.openqa.selenium.By;
import org.testng.Assert;

public class PickBusiness extends BasePage {
    public void pickBusiness() throws Exception {
        websiteURL();
        selectBusiness();
        choosePrice();
    }
    public void websiteURL() throws Exception{
        String siteURL = Singleton.getDriverInstance().getCurrentUrl();
        System.out.println(siteURL);
        Assert.assertEquals(siteURL, "https://buyme.co.il/search?budget=2&category=22&region=13");
    }
    public void selectBusiness() throws Exception{
        Thread.sleep(3000);
        clickElement(By.xpath("//*[@id=\"ember1430\"]/div[2]"));

    }
    public void choosePrice() throws Exception{//c
        Thread.sleep(2000);
        sendKeysToElement(By.xpath("//*[@id=\"ember1683\"]"), "5");
        Thread.sleep(2000);
        clickElement(By.xpath("//*[@id=\"ember1689\"]"));
    }
}
