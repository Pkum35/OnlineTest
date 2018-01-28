package com.stitchdata.recruitment.steps;

import com.stitchdata.recruitment.pages.HomePage;
import com.stitchdata.recruitment.pages.IntegrationPage;
import com.stitchdata.recruitment.pages.LoginPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.List;

public class IntegrationApps {

    public static final String HOME_URL = "https://app.stitchdata.com/session/create";
    private HomePage homePage;
    private LoginPage loginPage;
    private IntegrationPage integrationPage;

    public IntegrationApps(HomePage homePage, LoginPage loginPage, IntegrationPage integrationPage) {
        this.homePage = homePage;
        this.loginPage = loginPage;
        this.integrationPage=integrationPage;
    }

    @Given("^I navigate to StitchData home page$")
    public void iNavigateToStitchDataHomePage() {
        homePage.navigateTo(HOME_URL);
    }

    @Given("^I login with following user credential$")
    public void iLoginWithFollowingUserCredential(DataTable dataTable) {
        List<String> userCredentials = dataTable.asList(String.class);
        loginPage.login(userCredentials);
    }

    @When("^search for integration app \"([^\"]*)\"$")
    public void searchForIntegrationApp(String searchString) {
        integrationPage.searchForIntegrationApp(searchString);
    }


    @Then("^I see (\\d+) integration apps are certified by StitchData$")
    public void iSeeIntegrationAppsAreCertifiedByStitchData(int expectedNumberOfApps) {
        Assert.assertEquals("Checking number of Apps visible", expectedNumberOfApps, integrationPage.getNumberOfAppsVisible());
    }

    @And("^I close browser$")
    public void iCloseBrowser() throws Throwable {
        homePage.closeBrowser();
    }
}
