package com.WebUni.stepDefinitions;

import com.WebUni.pages.ContactUs;
import com.WebUni.utilities.ConfigurationReader;
import com.WebUni.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ContactUs_StepDef {
    ContactUs contactUs = new ContactUs();
    @Given("The user accesses the Web driver University Home Page")
    public void theUserAccessesTheWebDriverUniversityHomePage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        //Driver.getDriver().get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
    }

    @When("The user clicks the contact us page")
    public void theUserClicksTheContactUsPage() {
        //contactUs.contact_Us.click();
    }

    @And("The user enters a first name")
    public void theUserEntersAFirstName() {
        contactUs.firstName.sendKeys("Murat");
    }

    @And("The user enters a last name")
    public void theUserEntersALastName() {
        contactUs.lastName.sendKeys("Yilsirim,");
    }

    @And("The user enters an email address")
    public void theUserEntersAnEmailAddress() {
        contactUs.emailAddress.sendKeys("muratyildirim@gmail.com");
    }

    @And("The user enters a comment")
    public void theUserEntersAComment() {
        contactUs.comments.sendKeys("How are you?");
    }

    @And("The user clicks on the submit button")
    public void theUserClicksOnTheSubmitButton() {
        contactUs.submitButton.click();
    }

    @Then("The user should be presented with a successful contact us submission message")
    public void theUserShouldBePresentedWithASuccessfulContactUsSubmissionMessage() {
    }

    @And("The user enters a {string}, {string} and {string}")
    public void theUserEntersAAnd(String first, String last, String email) {
        contactUs.firstName.sendKeys(first);
        contactUs.lastName.sendKeys(last);
        contactUs.emailAddress.sendKeys(email);
    }

    @And("The user enters a {string}")
    public void theUserEntersA(String comment) {
        contactUs.comments.sendKeys(comment);
    }

    @Then("The user should be presented with a successful contact us {string}")
    public void theUserShouldBePresentedWithASuccessfulContactUs(String message) {
        Assert.assertEquals("Thank You for your Message!", message);
    }
}
