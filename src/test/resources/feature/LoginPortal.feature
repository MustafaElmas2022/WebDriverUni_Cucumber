@login
Feature: WebDriver University Login Portal

  Scenario Outline: User enters username and password
    Given the user should be the url "http://www.webdriveruniversity.com/Login-Portal/index.html"
    And the user enters "<username>" and "<password>"
    When the user clicks Login button
    Then the user closes Alert

    Examples:
      | username    | password    |
      | ExampleName | 10293847Kl. |