package BuyMeProject.Pages;

import org.openqa.selenium.By;
import org.testng.Assert;


public class IntroAndRegister extends BasePage {

    public void register() throws Exception {
        pressRegisterLogin();
        pressSignUp();
        insertName();
        insertEmail();
        insertPassword();
        insertSPassword();
        clickSignUp();
        //assertValues();
        //elementText();

    }
    private void pressRegisterLogin() throws Exception {
        clickElement(By.xpath("//*[@id=\"ember985\"]/div/ul[1]/li[3]/a/span"));
    }
    private void pressSignUp() throws Exception {
        Thread.sleep(5000);
        clickElement(By.xpath("//*[@id=\"ember944\"]/div/div[1]/div/div/div[3]/div[1]/span"));
    }
    private void insertName() throws Exception {
        //Thread.sleep(3000);
        String myElement = sendKeysToElement(By.id("ember1696"), "Noa");
        Assert.assertEquals(myElement, "Noa");




    }
    private void insertEmail() throws Exception {
        //Thread.sleep(3000);
        String myElement = sendKeysToElement(By.id("ember1703"), "icookiejar7@gmail.com");
        Assert.assertEquals(myElement, "icookiejar7@gmail.com");

    }
    private void insertPassword() throws Exception {
        //Thread.sleep(3000);
        String myElement = sendKeysToElement(By.id("valPass"), "111111");
        Assert.assertEquals(myElement, "111111");
    }
    private void insertSPassword() throws Exception {
        //Thread.sleep(3000);
        String myElement = sendKeysToElement(By.id("ember1717"), "111111");
        Assert.assertEquals(myElement, "111111");
    }
    private void clickSignUp() throws Exception {
        Thread.sleep(2000);
        clickElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div[3]/div[2]/div[3]/form/button/span"));
    }
//    private void elementText(){
//        String myElement = findElement(By.id("ember1696"), "Noa");
//        Assert.assertEquals(myElement, "Noa");
//    }
}
