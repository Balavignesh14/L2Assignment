package sampletesting;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SampleTesting {
    WebDriver driver;

    public void seleniumSampleCode() throws Exception {
        //Chrome driver setup
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //navigate to url
        driver.get("https://public.tableau.com/app/profile/archie.boswell/viz/Trading_17022895244000/Conditions1");
        driver.manage().window().maximize();
        Thread.sleep(6000);

        //Mouse action to click on download button
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath("//i[@id='downloadIcon']")));
        act.click().build().perform();
        Thread.sleep(6000);

        // The below code will move the focus to pdf via keyboard and it will press enter
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(6000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(6000);

    }


    public static void main(String[] args) throws Exception {
        SampleTesting obj = new SampleTesting();
        obj.seleniumSampleCode();
    }
}

