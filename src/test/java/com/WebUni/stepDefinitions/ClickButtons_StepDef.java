package com.WebUni.stepDefinitions;

import com.WebUni.pages.ClickButtons;
import com.WebUni.utilities.BrowserUtilities;
import com.WebUni.utilities.ConfigurationReader;
import com.WebUni.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ClickButtons_StepDef {

    ClickButtons clickButtons = new ClickButtons();
    @Given("the user should be on Button Clicks page")
    public void theUserShouldBeOnButtonClicksPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("urlClickButtons"));
        Assert.assertEquals("http://www.webdriveruniversity.com/Click-Buttons/index.html",Driver.getDriver().getCurrentUrl());
    }

    @And("the user verifies that {string} is visible")
    public void theUserVerifiesThatIsVisible(String webElementText) {
        clickButtons.WebElementClick.isDisplayed();
    }

    @When("the user clicks CLICK ME! button in the WebElement Click part")
    public void theUserClicksCLICKMEButtonInTheWebElementClickPart() {
        clickButtons.ClickMe.click();
    }

    @Then("the user verifies {string} in the pop-up window and clicks the close button")
    public void theUserVerifiesInThePopUpWindowAndClicksTheCloseButton(String expected) {
        clickButtons.Congratulations.isDisplayed();
        clickButtons.closeButton.click();
    }

    @And("the user verifies that JavaScript Click is visible")
    public void theUserVerifiesThatJavaScriptClickIsVisible() {
        clickButtons.javaScriptClick.isDisplayed();
    }

    @When("the user clicks CLICK ME! button in the JavaScript Click part")
    public void theUserClicksCLICKMEButtonInTheJavaScriptClickPart() {
        BrowserUtilities.clickWithJS(clickButtons.clickMeButton2);
    }

    @Then("the user verifies that pop up message is visible and clicks close button")
    public void theUserVerifiesThatPopUpMessageIsVisibleAndClicksCloseButton() {
        clickButtons.popUpMessage.isDisplayed();
        clickButtons.closeButton2.click();
    }

    @And("the user verifies that Action Move & Click is visible")
    public void theUserVerifiesThatActionMoveClickIsVisible() {
        clickButtons.actionClickText.isDisplayed();
    }

    @When("the user clicks CLICK ME! button in the Action Move & Click part")
    public void theUserClicksCLICKMEButtonInTheActionMoveClickPart() {

        clickButtons.clickMeButton3.click();
    }

    @Then("the user verifies that pop up message {string} is visible and clicks close button")
    public void theUserVerifiesThatPopUpMessageIsVisibleAndClicksCloseButton(String arg0) {
        clickButtons.actionPopUpMessage.isDisplayed();
        clickButtons.closeButton3.click();
    }
}
