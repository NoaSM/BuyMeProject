package BuyMeProject.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomeScreen extends BasePage {
    public void home() throws Exception {
        sumSelection();
    }
    private void sumSelection() throws Exception {
        clickElement(By.className("selected-text"));
        clickElement((By.id("ember1057")));
        //findElements(By.className("selected-text"));
    }



}
