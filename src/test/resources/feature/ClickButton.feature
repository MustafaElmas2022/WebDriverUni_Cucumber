@clickButtons
Feature: WebDriver University Click Buttons

  Background:
    Given the user should be on Button Clicks page

  Scenario: User click WebElement Click
    And the user verifies that "WebElement Click" is visible
    When the user clicks CLICK ME! button in the WebElement Click part
    Then the user verifies "Congratulations!" in the pop-up window and clicks the close button

    Scenario: User click JavaScript Click
      And the user verifies that JavaScript Click is visible
      When the user clicks CLICK ME! button in the JavaScript Click part
      Then the user verifies that pop up message is visible and clicks close button

  Scenario: User click Action Move & Click
    And the user verifies that Action Move & Click is visible
    When the user clicks CLICK ME! button in the Action Move & Click part
    Then the user verifies that pop up message "Well done! the Action Move & Click" is visible and clicks close button

