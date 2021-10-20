package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected static WebDriver webDriver;
    protected static WebDriverWait wait;

    public void setWebDriver(WebDriver webDriver) {
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

    protected void clearEditFieldByXpath(String xpath) {
        findElementByXpath(xpath).clear();
    }

    protected boolean elementExists(String xpath) {
        try {
            findElementByXpath(xpath);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    protected void sendKeysToElementByXpath(String xpath, String text) {
        findElementByXpath(xpath).sendKeys(text);
    }

    protected void sendEnterKeyByXpath(String xpath) {
        findElementByXpath(xpath).sendKeys(Keys.ENTER);
    }
    protected String getCurrentUrl() {
        return webDriver.getCurrentUrl();
    }
}
