package com.stitchdata.recruitment.pages;

public class HomePage extends BasePage {

    public void navigateTo(String url) {
        driver.get(url);
    }

    public void closeBrowser() {
        driver.close();
    }
}
