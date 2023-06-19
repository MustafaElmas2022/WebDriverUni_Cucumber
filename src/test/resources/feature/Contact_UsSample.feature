@webUni
Feature: WebDriver University Contact Us Page

  Scenario: Validate Successful Submission
    Given The user accesses the Web driver University Home Page
    When The user clicks the contact us page
    And The user enters a first name
    And The user enters a last name
    And The user enters an email address
    And The user enters a comment
    And The user clicks on the submit button
    Then The user should be presented with a successful contact us submission message