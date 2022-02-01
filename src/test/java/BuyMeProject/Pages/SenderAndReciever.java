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
        Thread.sleep(2000);
        String recieversName = sendKeysToElement(By.id("friendName"),("ForYou"));//inserting the name of the receiver of the gift
        //Thread.sleep(500);
        clickElement(By.cssSelector("label[gtm=eventType]"));//clicking on drown-down list
        //Thread.sleep(500);
        clickElement(By.cssSelector("li[value=\"11\"]"));//clicking on event
        //Thread.sleep(1000);
        clickElement(By.cssSelector("span[class=\"textarea-clear-all \"]"));//cleans the text that's written in Wishes
        sendKeysToElement(By.cssSelector("textarea[class=\"parsley-success\"]"), ("Thank you!"));//typing a wish
        Assert.assertEquals(recieversName,"ForYou");//asserting the name of the receiver of the gift
    }
    public void picUpload() throws Exception{
        sendKeysToElement(By.cssSelector("input[type=\"file\"]"),("C:\\Users\\Noa\\Desktop\\bunny.jpg"));//uploading a picture
    }
    public void continueBtn() throws Exception{
        clickElement(By.cssSelector("button[type=\"submit\"]"));//pressing on continue button

    }
    public void emailDetails() throws Exception{
        clickElement(By.cssSelector("svg[gtm=method-email]"));//choosing the email option
        sendKeysToElement(By.xpath("//*[@id=\"email\"]"),("lalala@gmail.com"));//inserting receiver's email
    }
    public void sendersName() throws Exception{
        String sendersName = sendKeysToElement(By.cssSelector("input[placeholder=\"שם שולח המתנה\"]"),("Me"));//typing in the name of the sender
        Assert.assertEquals(sendersName,"Me");//asserting the name of the sender
    }
    public void continueToPayment() throws Exception{//press on continue button for payment
        clickElement(By.cssSelector("button[type=\"submit\"]"));



    }


}
