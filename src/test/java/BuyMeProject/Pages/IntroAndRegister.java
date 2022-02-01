package BuyMeProject.Pages;

import BuyMeProject.Singleton;
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



    }
    private void pressRegisterLogin() throws Exception {//pressing on register/login button
        clickElement(By.xpath("//*[@id=\"ember985\"]/div/ul[1]/li[3]/a/span"));
    }
    private void pressSignUp() throws Exception {//pressing on sign up text
        //Thread.sleep(5000);
        clickElement(By.xpath("//*[@id=\"ember944\"]/div/div[1]/div/div/div[3]/div[1]/span"));
    }
    private void insertName() throws Exception {//inserting private name and asserting the name
        //Thread.sleep(3000);
        String myElement = sendKeysToElement(By.id("ember1696"), "Noa");
        Assert.assertEquals(myElement, "Noa");

    }
    private void insertEmail() throws Exception {//inserting an email address and asserting it
        //Thread.sleep(3000);

        String myElement = sendKeysToElement(By.id("ember1703"), "lili@gmail.com");
        Assert.assertEquals(myElement, "lili@gmail.com");

    }
    private void insertPassword() throws Exception {//inserting password and asserting it
        //Thread.sleep(3000);
        String myElement = sendKeysToElement(By.id("valPass"), "111111");
        Assert.assertEquals(myElement, "111111");
    }
    private void insertSPassword() throws Exception {//inserting secondary password and asserting it
        //Thread.sleep(3000);
        String myElement = sendKeysToElement(By.id("ember1717"), "111111");
        Assert.assertEquals(myElement, "111111");

        //the passwords are on purpose so it can't be signed up, but it works
    }


    private void clickSignUp() throws Exception {//pressing on sign up button
        //Thread.sleep(2000);
        clickElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div[3]/div[2]/div[3]/form/button/span"));
    }

}
