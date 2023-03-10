package org.example;// Generated by Selenium IDE

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Test1Test {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;

    public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver", "/home/gd/workspace/ChromeDriver/chromedriver");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("start-maximized");
            WebDriver driver =  new ChromeDriver(options);
            String url1 = "https://mail.google.com/";
            String url2 = "https://mail.google.com/";
            driver.get(url1);
            String firstWindowHandle = driver.getWindowHandle();
            System.out.println("First Window Handle is: "+firstWindowHandle);
            // Opening Facebook in the adjacent TAB
            ((JavascriptExecutor)driver).executeScript("window.open('" + url2 +"');");



            new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.numberOfWindowsToBe(2));



            Set<String> allWindowHandles = driver.getWindowHandles();
            // Using iterator
            Iterator<String> itr = allWindowHandles.iterator();
            while(itr.hasNext()) {
                String nextWindow = itr.next();
                if(!firstWindowHandle.equalsIgnoreCase(nextWindow)) {
                    driver.switchTo().window(nextWindow);
                    System.out.println("New Tab Window Handle is: "+nextWindow);
                }
            }
        }

//    public static void main(String[] args) throws InterruptedException, AWTException {
//        Test1Test t = new Test1Test();
//        t.test1();
//    }

    public void test1() throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "/home/gd/workspace/ChromeDriver/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        String baseUrl = "http://www.google.co.uk/";
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.id("L2AGLb")).click();

        Robot rob = new Robot();
        rob.keyPress(KeyEvent.VK_CONTROL);
        rob.keyPress(KeyEvent.VK_T);
        rob.keyRelease(KeyEvent.VK_CONTROL);
        rob.keyRelease(KeyEvent.VK_T);


        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1)); //switches to new tab
        driver.get("https://www.facebook.com");

        driver.switchTo().window(tabs.get(0)); // switch back to main screen
        driver.get("https://www.news.google.com");


//        String url = "https://www.google.com/";
//        driver.get(url);
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        // identify element and input text inside it
//        WebElement l =driver.findElement(By.tagName("body"));
//        System.out.println("Text content: "+ l.getText());
//        driver.findElement(By.id("L2AGLb")).click();
        driver.quit();

    }
}