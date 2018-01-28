package com.stitchdata.recruitment.pages;

import org.openqa.selenium.By;

import java.util.List;

public class LoginPage extends BasePage {
    private By txtBoxEmailAddress = By.name("email");
    private By txtBoxPassword = By.name("password");
    private By btnLogin = By.xpath("//button[contains(@submit-button,'view.login')]");


    public void login(List<String> userCredentials) {
        sendKeys(txtBoxEmailAddress, userCredentials.get(0));
        sendKeys(txtBoxPassword, userCredentials.get(1));
        click(btnLogin);
    }
}
