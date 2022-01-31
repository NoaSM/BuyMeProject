package BuyMeProject.Pages;

import BuyMeProject.Singleton;
import BuyMeProject.Utils;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;



public class MainTest {
    public static ExtentReports extent = new ExtentReports();
    public static ExtentTest test = extent.createTest("BuyMe", "Reports for BuyMe project");
    @BeforeClass
    public static void before_class() throws Exception {
        String cwd = System.getProperty("user.dir");
        ExtentSparkReporter htmlReporter = new ExtentSparkReporter(cwd + "\\extent.html");
        extent.attachReporter(htmlReporter);

        test.info("Before class Will activate the driver and upload the webpage");
        try {
            String URL = Utils.getData("URL");
            Singleton.getDriverInstance().get(URL);
            //WebDriverWait wait = new WebDriverWait(Singleton.getDriverInstance(), Duration.ofSeconds(10));
            test.pass("Passed, driver worked");
        } catch (Exception e) {
            e.printStackTrace();
            test.fail("Failed, driver did not work" + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(Singleton.getDriverInstance(), "picName")).build());
        }
    }
//    @Test
//    public void test01_login() throws Exception {
//        test.info("This test will create a new user and log in the website");
//        try{
//            IntroAndRegister introAndRegister = new IntroAndRegister();
//            introAndRegister.register();
//            test.pass("The test has passed");
//        }catch (Exception e){
//            e.printStackTrace();
//            test.fail("The test has failed" + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(Singleton.getDriverInstance(), "picName")).build());
//    }
//    }
    @Test
    public void test_02_home() throws Exception {
        test.info("This test will select values in search list and search for a gift according to the values chosen");
        try {
            HomeScreen homeScreen = new HomeScreen();
            homeScreen.home();

            test.pass("The test has passed");
        } catch (Exception e) {
            e.printStackTrace();
            test.fail("The test has failed" + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(Singleton.getDriverInstance(), "picName")).build());
        }
    }
    @Test
    public void test_03_pickbusiness () throws Exception {
        test.info("This test will pick a business and insert an amount of money");
        try {
            PickBusiness pickBusiness = new PickBusiness();
            pickBusiness.pickBusiness();
            test.pass("The test has passed");
        } catch (Exception e) {
            test.fail("The test has failed" + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(Singleton.getDriverInstance(), "picName")).build());
            }
        }
//
    @Test
    public void test_04_senderAndReciever() throws Exception{
        test.info("This test will insert the information of the sender and the reciever and upload a picture");
        try{
            SenderAndReciever senderAndReciever = new SenderAndReciever();
            senderAndReciever.sendGift();
            test.pass("The test has passed");
        } catch (Exception e) {
            test.fail("The test has failed" + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(Singleton.getDriverInstance(), "picName")).build());
        }
    }

    @AfterClass
    public void after_class(){
        extent.flush();
    }

    private static String takeScreenShot(WebDriver driver, String ImagesPath) {
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File screenShotFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destinationFile = new File(ImagesPath + ".png");
        try {
            FileUtils.copyFile(screenShotFile, destinationFile);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return ImagesPath + ".png";
    }
}
