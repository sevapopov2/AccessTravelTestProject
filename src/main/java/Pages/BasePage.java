package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    protected static WebDriver webDriver;
    protected static WebDriverWait wait;

    public void setWebdriver(WebDriver webDriver) {
        this.webDriver = webDriver;
        wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
    }

    protected WebElement findElementByXpath(String xpath) {
        WebElement element;
        element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
        return element;
    }

    protected void clickElementByXpath(String xpath) {
        findElementByXpath(xpath).click();
    }

    protected boolean elementExists(String xpath) {
        try {
            findElementByXpath(xpath);
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }

    protected void sendKeysToElementByXpath(String xpath, String text) {
        findElementByXpath(xpath).sendKeys(text);
    }
}
