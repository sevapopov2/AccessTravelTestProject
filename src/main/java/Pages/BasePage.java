package Pages;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

    protected WebElement findElementByLocator(String locatorXpath, String xpath, WebElement locator, int pixelsCount) {
        locator = findElementByXpath(locatorXpath);
        WebElement element = wait
                .until(ExpectedConditions.presenceOfElementLocated(with(By.xpath(xpath)).near(locator, pixelsCount)));
        return element;
    }

    protected String getCurrentUrl() {
        return webDriver.getCurrentUrl();
    }

    public void takeScreenshot(String name) {
        TakesScreenshot takesScreenshot = (TakesScreenshot) webDriver;
        File file = takesScreenshot.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File("Screenshots/" + name + ".jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
