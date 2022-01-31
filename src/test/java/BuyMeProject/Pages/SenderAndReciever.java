package BuyMeProject.Pages;

import org.openqa.selenium.By;
import org.testng.Assert;

public class SenderAndReciever extends BasePage {
    public void sendGift() throws Exception{
        enterDetails();
        picUpload();
        continueBtn();
        emailDetails();
        sendersName();
        continueToPayment();


    }
    public void enterDetails() throws Exception{
        Thread.sleep(3000);
        String recieversName = sendKeysToElement(By.id("friendName"),("ForYou"));
        Thread.sleep(3000);
        clickElement(By.cssSelector("label[gtm=eventType]"));
        Thread.sleep(3000);
        clickElement(By.cssSelector("li[value=\"11\"]"));
        Thread.sleep(3000);
        clickElement(By.cssSelector("span[class=\"textarea-clear-all \"]"));
        sendKeysToElement(By.cssSelector("textarea[class=\"parsley-success\"]"), ("Thank you!"));
        Assert.assertEquals(recieversName,"ForYou");
    }
    public void picUpload() throws Exception{
        sendKeysToElement(By.cssSelector("input[type=\"file\"]"),("C:\\Users\\Noa\\Desktop\\bunny.jpg"));
    }
    public void continueBtn() throws Exception{
        clickElement(By.cssSelector("button[type=\"submit\"]"));

    }
    public void emailDetails() throws Exception{
        clickElement(By.cssSelector("svg[gtm=method-email]"));
        sendKeysToElement(By.xpath("//*[@id=\"email\"]"),("lalala@gmail.com"));
    }
    public void sendersName() throws Exception{
        String sendersName = sendKeysToElement(By.cssSelector("input[placeholder=\"שם שולח המתנה\"]"),("Me"));
        Assert.assertEquals(sendersName,"Me");
    }
    public void continueToPayment() throws Exception{//c
        clickElement(By.cssSelector("button[type=\"submit\"]"));
    }


}
