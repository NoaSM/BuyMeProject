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
    //private static WebDriverWait wait;

    public static WebDriver getDriverInstance()throws Exception {
        if (driver == null) {
//            String type = getData("browserType");
//            if (type.equals("Chrome")) {
                System.setProperty("webdriver.chrome.driver", Constants.CHROMEDRIVER_PATH);
                driver = new ChromeDriver();
                //driver.get("https://buyme.co.il/");

            }

            //wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return driver;
        }


    }

//    public static String getData (String keyName) throws Exception{
//        ClassLoader classLoader = Singleton.class.getClassLoader();
//        String xmlFilePath = String.valueOf(new File(classLoader.getResource("C:\\Users\\Noa\\Downloads\\SeleniumHandsOn\\SeleniumHandsOn\\src\\main\\resources\\data.xml").getFile()));
//        File fXmlFile = new File(xmlFilePath);
//        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
//        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
//        Document doc = dBuilder.parse(fXmlFile);
//        doc.getDocumentElement().normalize();
//        return doc.getElementsByTagName(keyName).item(0).getTextContent();
//    }

