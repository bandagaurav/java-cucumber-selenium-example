Feature: New BDD Scenarios
  Scenario: User logs in successfully
    Given User is on the login page
    When User enters valid credentials
    Then User is redirected to the dashboard