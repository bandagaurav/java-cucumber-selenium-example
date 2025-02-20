Feature: GAUR-223 Test Cases

Scenario: Verify the login functionality
  Given the user is on the login page
  When the user enters valid credentials
  Then the user should be redirected to the dashboard page