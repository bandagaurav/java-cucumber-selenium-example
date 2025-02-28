Feature: User login
  Scenario: Successful login with valid credentials
    Given the user is on the login page
    When the user enters valid credentials
    And the user clicks on the login button
    Then the user should be redirected to the homepage