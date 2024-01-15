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

  Scenario: Validate Employee List Functionality
    When user capture the Employee id
    And user click on Employee List Button

  Scenario: Search Employee Functionality
    When user enter employeeId
    And user click on search button

  Scenario: Delete EmployeeID Functionality
    When user click on checkbox of employeeID
    And user selete the EmployeeId
