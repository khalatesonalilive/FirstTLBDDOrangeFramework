Feature: Test the OrangeHRM Functionality

  Scenario: Validate Login Page Functionality
    Given user is on Login Page
    When user enter valid username and password
    Then user click Login Button
