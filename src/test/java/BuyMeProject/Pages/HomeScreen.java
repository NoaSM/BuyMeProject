package BuyMeProject.Pages;

import BuyMeProject.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomeScreen extends BasePage {
    public void home() throws Exception {
        sumSelection();
        areaSelection();
        categorySelection();
        findButton();

    }
    private void sumSelection() throws Exception {//choosing a value from prices drown-down list
        //Thread.sleep(500);
        clickElement(By.xpath("//*[@id=\"ember1034\"]/div/div[1]/span"));
        //Thread.sleep(500);
        clickElement((By.xpath("//*[@id=\"ember1057\"]/span")));
    }
    public void areaSelection() throws Exception{//choosing a value from area drop-down list
       //Thread.sleep(500);
        clickElement(By.xpath("//*[@id=\"ember1069\"]/div/div[1]/span"));
        //Thread.sleep(500);
        clickElement(By.xpath("//*[@id=\"ember1091\"]/span"));
    }
    public void categorySelection() throws Exception{//choosing a value from category drop-down list
        //Thread.sleep(500);
        clickElement(By.xpath("//*[@id=\"ember1101\"]/div/div[1]/span"));
        //Thread.sleep(500);
        clickElement(By.xpath("//*[@id=\"ember1154\"]/span"));

    }
    public void findButton() throws Exception{//pressing on Find a gift button
        //Thread.sleep(1000);
        clickElement(By.id("ember1180"));

    }



}
