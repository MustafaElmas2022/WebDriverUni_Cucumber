package com.WebUni.stepDefinitions;

import com.WebUni.pages.LoginPortal;
import com.WebUni.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.WebUni.utilities.BrowserUtilities.wait;

public class LoginPortal_StepDef {
    LoginPortal loginPortal = new LoginPortal();

    @Given("the user should be the url {string}")
    public void theUserShouldBeTheUrl(String url) {
        Driver.getDriver().get(url);
        Assert.assertEquals(url,Driver.getDriver().getCurrentUrl());
    }

    @And("the user enters {string} and {string}")
    public void theUserEntersAnd(String userName, String password) {

        loginPortal.username.sendKeys(userName);
        loginPortal.password.sendKeys(password);
    }

    @When("the user clicks Login button")
    public void theUserClicksLoginButton() {
        loginPortal.loginButton.click();
    }

    @Then("the user closes Alert")
    public void theUserClosesAlert() {
        //Wait for the alert to be displayed and store it in a variable
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String text = alert.getText();
        System.out.println(text);
        alert.accept(); //Press the OK button
    }
}
