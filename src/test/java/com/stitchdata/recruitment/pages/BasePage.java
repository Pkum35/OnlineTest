package com.stitchdata.recruitment.pages;

import com.stitchdata.recruitment.helper.WebDriverHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePage {
    protected static WebDriver driver;
    private WebDriverWait webDriverWait = new WebDriverWait(driver, 30);

    static {
        System.setProperty("webdriver.gecko.driver", "/Users/jitendersingh/IdeaProjects/OnlineTest/ghekoDriver/mac-geckodriver2");
        driver = WebDriverHelper.getWebDriver("firefox");
    }


    protected WebElement findElement(By by) {
        return webDriverWait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    protected List<WebElement> findElements(By by) {
        return webDriverWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
    }


    protected WebElement waitForElementToBeInteractable(By by) {
        return webDriverWait.until(ExpectedConditions.elementToBeClickable(findElement(by)));
    }

    protected void click(By by) {
        waitForElementToBeInteractable(by).click();
    }

    protected void sendKeys(By by, String txtToType) {
        waitForElementToBeInteractable(by).sendKeys(txtToType);
    }

}
