Feature: Test the OrangeHRM Functionality

  Scenario: Validate Login Page Functionality
    Given user is on Login Page
    When user enter valid username and password
    Then user click Login Button

  Scenario: Validate the Home Page Functionality
    When user is on Home page and validate Home Page Title
    And user validate Home Page URL
    And user validate Home Page Logo

  Scenario: Validate the PIM Page Functionality
    When user is on PIM Page and Validate PIM Page URL
    And user click on Add Employee and enter firstName , lastName and click on save button
