@webUni1
Feature: WebDriver University Contact Us Page

  Scenario Outline: Validate Successful Submission
    Given The user accesses the Web driver University Home Page
    When The user clicks the contact us page
    And The user enters a "<firstName>", "<lastname>" and "<emailAddress>"
    And The user enters a "<comment>"
    And The user clicks on the submit button
    Then The user should be presented with a successful contact us "<submission message>"

    Examples:
      | firstName | lastname | emailAddress         | comment       | submission message          |
      | Murat     | Yildirim | yildirim@gmail.com   | How is going? | Thank You for your Message! |
      | George    | Will     | georgeWill@gmail     | How is going? | Thank You for your Message! |
      | Anna      | Smirnov  | smirnovAnnagmail.com | How is going? | Thank You for your Message! |