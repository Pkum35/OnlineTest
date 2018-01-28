package com.stitchdata.recruitment.pages;

import org.openqa.selenium.By;

public class IntegrationPage extends BasePage{
    private By btnAddIntegration = By.cssSelector("a.st-search-box__add-button");
    private By txtSearchIntegration = By.cssSelector("input[placeholder='Search Directory']");
    private By listOfIntegrationAppsListed = By.cssSelector("div.st-integration-picker-grid div.st-integration-picker-grid__item");

    public void searchForIntegrationApp(String searchString) {
        sendKeys(txtSearchIntegration, searchString);
    }

    public int getNumberOfAppsVisible() {
        return findElements(listOfIntegrationAppsListed).size();
    }
}
