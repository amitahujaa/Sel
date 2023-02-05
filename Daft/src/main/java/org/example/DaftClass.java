package org.example;
// Generated by Selenium IDE
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class DaftClass {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;

    public void test1(WebDriver driver) {

        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
        ((JavascriptExecutor)driver).executeScript("window.open('https://www.daft.ie/for-rent/apartment-2-bedroom-apartment-u-clay-farm-clay-farm-leopardstown-leopardstown-dublin-18/3946908');");
        //driver.get("https://www.daft.ie/for-rent/apartment-2-bedroom-apartment-u-clay-farm-clay-farm-leopardstown-leopardstown-dublin-18/3946908");
        //driver.manage().window().setSize(new Dimension(1366, 703));
        js.executeScript("window.scrollTo(0,42)");
        js.executeScript("window.scrollTo(0,504)");
        js.executeScript("window.scrollTo(0,742)");
        driver.findElement(By.cssSelector(".deYANw:nth-child(2) > .NewButton__StyledButton-yem86a-2")).click();
        driver.findElement(By.id("keyword1")).click();
        driver.findElement(By.id("keyword1")).sendKeys("Amit Ahuja");
        driver.findElement(By.id("keyword2")).sendKeys("sai.amit.ahuja@gmail.com");
        driver.findElement(By.cssSelector("#input-wrapper-phone > .Styles__FormField-sc-1sc49hg-7")).click();
        driver.findElement(By.id("keyword3")).click();
        driver.findElement(By.id("keyword3")).sendKeys("0896133658");
        driver.findElement(By.id("message")).click();
        driver.findElement(By.id("message")).sendKeys("Hi,\\n\\nPlease suggest if its available\\n\\nThanks,\\nAmit Ahuja");
        driver.findElement(By.cssSelector(".Styles__ButtonContainer-sc-1sc49hg-9:nth-child(5) .NewButton__ButtonText-yem86a-0")).click();
        driver.findElement(By.cssSelector(".styles__CloseContainer-qea560-4 path")).click();
        js.executeScript("window.scrollTo(0,692)");
        //driver.close();
    }
}