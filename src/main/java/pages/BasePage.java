package pages;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utils.Driver;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class BasePage extends Driver {

    static JavascriptExecutor jse = (JavascriptExecutor) driver;
    static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    static Actions actions = new Actions(driver);

    public BasePage() {

        PageFactory.initElements(driver, this);

    }

    public WebElement centerElement(WebElement element) {

        String scrollElementIntoMiddle = "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);"
                + "var elementTop = arguments[0].getBoundingClientRect().top;"
                + "window.scrollBy(0, elementTop-(viewPortHeight/2));";

        ((JavascriptExecutor) driver).executeScript(scrollElementIntoMiddle, element);
        waitFor(1500);
        return element;

    }

    public void navigateToUrl(String url) {

        driver.get(url);

    }

    public void verifyUrl(String url) {

        Assert.assertEquals(url, driver.getCurrentUrl());

    }

    public boolean checkElementsAreValid(List<WebElement> element) {

        return true;

    }

    public void waitFor(long milliSeconds) {

        try {

            Thread.sleep(milliSeconds);

        } catch (InterruptedException e) {

        }

    }

    public void hoverOverAndClick(WebElement element) {

        actions.moveToElement(element)
                .click()
                .build().perform();

    }

}