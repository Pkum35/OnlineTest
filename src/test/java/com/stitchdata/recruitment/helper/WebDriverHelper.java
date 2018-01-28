package com.stitchdata.recruitment.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverHelper {

    private static WebDriver driver;

    private static final Thread CLOSE_THREAD = new Thread() {
        @Override
        public void run() {
            driver.quit();
        }
    };

    public static WebDriver getWebDriver(String browserName) {
        if (driver == null) {
            if(browserName.equalsIgnoreCase("firefox"))
                driver = new FirefoxDriver();
            Runtime.getRuntime().addShutdownHook(CLOSE_THREAD);
        }
        return driver;
    }
}
