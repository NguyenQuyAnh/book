package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected WebDriver driver;
    protected int time = 15;

    public void nagative(String url)
    {
        driver.navigate().to(url);
    }

    public WebElement waitUntil(WebElement element)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        try {
            return wait.until(ExpectedConditions.visibilityOf(element));
        } catch (Exception e) {
            throw new RuntimeException("test");
        }
    }

    public void sendKey(WebElement element, String textInput)
    {
//        waitUntil(element);
        element.sendKeys(textInput);
    }

    public void click(WebElement element)
    {
        waitUntil(element);
        element.click();
    }

    public void sleep (int time)
    {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
