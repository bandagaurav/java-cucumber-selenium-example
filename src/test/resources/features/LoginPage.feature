Feature: Login Page Validation
  Scenario: Valid Login
    Given User is on Login Page
    When User enters valid credentials
    Then User is redirected to Dashboard