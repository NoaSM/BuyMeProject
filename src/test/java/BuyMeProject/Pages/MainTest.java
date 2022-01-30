package BuyMeProject.Pages;

import BuyMeProject.Singleton;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import java.io.File;
import java.io.IOException;

public class MainTest {
    private static ExtentReports extent = new ExtentReports();
    private static ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
    @BeforeClass
    public static void before_class() throws Exception {
        String cwd = System.getProperty("user.dir");
        ExtentSparkReporter htmlReporter = new ExtentSparkReporter(cwd+"\\extent.html");
        extent.attachReporter(htmlReporter);
        test.log(Status.INFO, "before test method");
        // screenshot
        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(Singleton.getDriverInstance(), "picName")).build());
        Singleton.getDriverInstance().get("https://buyme.co.il/");

    }
    @Test
    public void test01_login() throws Exception {
        IntroAndRegister introAndRegister = new IntroAndRegister();
        introAndRegister.register();
    }
    @Test
    public void test_02_home() throws Exception{
        HomeScreen homeScreen = new HomeScreen();
        homeScreen.home();
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
