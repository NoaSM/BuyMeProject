package BuyMeProject.Pages;

import BuyMeProject.Singleton;
import org.openqa.selenium.By;
import org.testng.Assert;

public class Extras extends BasePage{
    public void extras() throws Exception{
        homeScreen();
    }
    public void homeScreen() throws Exception{
        clickElement(By.xpath("//*[@id=\"ember985\"]/div/ul[1]/li[3]/a/span"));
        Thread.sleep(2000);
        clickElement(By.cssSelector("span[class=\"label\"]"));

        System.out.println(getElement(By.cssSelector("ul[id=\"parsley-id-14\"]")));
        String errorText1 = getElement(By.cssSelector("ul[id=\"parsley-id-14\"]"));
        Assert.assertEquals(errorText1, "כל המתנות מחכות לך! אבל קודם צריך מייל וסיסמה");

        System.out.println(getElement(By.cssSelector("ul[id=\"parsley-id-12\"]")));
        String errorText2 = getElement(By.cssSelector("ul[id=\"parsley-id-12\"]"));
        Assert.assertEquals(errorText2, "כל המתנות מחכות לך! אבל קודם צריך מייל וסיסמה");
    }
}
