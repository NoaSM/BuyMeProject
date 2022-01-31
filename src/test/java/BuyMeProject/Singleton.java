package BuyMeProject;

import BuyMeProject.Pages.MainTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.time.Duration;

public class Singleton {
    private static WebDriver driver;
    private static WebDriverWait wait;

    public static WebDriver getDriverInstance() throws Exception {//c
        if (driver == null) {
            String type = Utils.getData("browserType");
            if (type.equals("Chrome")) {
                System.setProperty("webdriver.chrome.driver", Constants.CHROMEDRIVER_PATH);
                driver = new ChromeDriver();
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                //wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                //driver.get("https://buyme.co.il/");

            }
            //wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        }
        return driver;
    }


}

