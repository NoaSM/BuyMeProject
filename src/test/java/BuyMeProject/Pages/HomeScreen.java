package BuyMeProject.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomeScreen extends BasePage {
    public void home() throws Exception {
        sumSelection();
        areaSelection();
        categorySelection();
        findButton();

    }
    private void sumSelection() throws Exception {
        clickElement(By.xpath("//*[@id=\"ember1034\"]/div/div[1]/span"));
        clickElement((By.xpath("//*[@id=\"ember1057\"]/span")));
        //findElements(By.className("selected-text"));
    }
    public void areaSelection() throws Exception{
        Thread.sleep(2000);
        clickElement(By.xpath("//*[@id=\"ember1069\"]/div/div[1]/span"));
        clickElement(By.xpath("//*[@id=\"ember1091\"]/span"));
    }
    public void categorySelection() throws Exception{
        Thread.sleep(2000);
        clickElement(By.xpath("//*[@id=\"ember1101\"]/div/div[1]/span"));
        clickElement(By.xpath("//*[@id=\"ember1154\"]/span"));

    }
    public void findButton() throws Exception{
        Thread.sleep(2000);
        clickElement(By.id("ember1180"));

    }



}
