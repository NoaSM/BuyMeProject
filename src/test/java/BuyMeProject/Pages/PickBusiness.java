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
    public void websiteURL() throws Exception{//assering the correct url
        String siteURL = Singleton.getDriverInstance().getCurrentUrl();
        System.out.println(siteURL);
        Assert.assertEquals(siteURL, "https://buyme.co.il/search?budget=2&category=22&region=13");
    }
    public void selectBusiness() throws Exception{//pressing on a coupon(Azrieli Gift Card)
        //Thread.sleep(2000);
        clickElement(By.xpath("//*[@id=\"ember1752\"]/div[2]"));//*[@id="ember1752"]/div[2]

    }
    public void choosePrice() throws Exception{//Inserting the price of 5 shekels, and pressing on continue button
        Thread.sleep(1000);
        sendKeysToElement(By.xpath("//*[@id=\"ember2002\"]"), "5");
        //Thread.sleep(2000);
        clickElement(By.xpath("//*[@id=\"ember2009\"]"));
    }
}
