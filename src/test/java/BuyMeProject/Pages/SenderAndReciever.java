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
        //assertNames();

    }
    public void enterDetails() throws Exception{
        String recieversName = sendKeysToElement(By.xpath("//*[@id=\"ember1278\"]"),("ForYou"));
        clickElement(By.xpath("//*[@id=\"ember1569\"]/div/div[1]/span"));
        clickElement(By.xpath("//*[@id=\"ember1607\"]/span"));
        clickElement(By.xpath("//*[@id=\"ember1295\"]/span[2]"));
        sendKeysToElement(By.xpath("//*[@id=\"ember1295\"]/textarea"), ("Thank you!"));
        Assert.assertEquals(recieversName,"ForYou");
    }
    public void picUpload() throws Exception{
        sendKeysToElement(By.xpath("//*[@id=\"ember1304\"]"),("C:\\Users\\Noa\\Desktop\\bunny.jpg"));
    }
    public void continueBtn() throws Exception{
        clickElement(By.xpath("//*[@id=\"ember1311\"]"));

    }
    public void emailDetails() throws Exception{
        clickElement(By.cssSelector("svg[gtm=method-email]"));
        sendKeysToElement(By.xpath("//*[@id=\"email\"]"),("lalala@gmail.com"));
    }
    public void sendersName() throws Exception{
        String sendersName = sendKeysToElement(By.xpath("//*[@id=\"ember1673\"]"),("Me"));
        Assert.assertEquals(sendersName,"Me");
    }
    public void continueToPayment() throws Exception{//c
        clickElement(By.xpath("//*[@id=\"ember1678\"]"));
    }


}
