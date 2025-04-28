Feature: Enhanced Login Scenarios

  Scenario: Successful Login
    Given I navigate to login page
    When I submit username "admin" and password "pw1234"
    And I click the login button
    Then I will be logged into the Admin Dashboard
    And I should be able to access the protected area

  Scenario: Support for Horizontal Data Table
    Given I navigate to login page
    And I enter following for login
      | username | admin  |
      | password | pw1234 |
    When I click the login button
    Then I will be logged into the Admin Dashboard
    And I should be able to access the protected area

  Scenario: Support for Vertical Data Table
    Given I navigate to login page
    And I enter following values to login
      | username | admin  |
      | password | pw1234 |
    When I click the login button
    Then I will be logged into the Admin Dashboard
    And I should be able to access the protected area

  Scenario: Unsuccessful Login with Incorrect Credentials
    Given I navigate to login page
    When I submit username "admin" and password "wrongpassword"
    And I click the login button
    Then I should see an error message "Incorrect username or password"

  Scenario: Secure Login Process
    Given I navigate to login page
    When I submit username "admin" and password "pw1234"
    And I click the login button
    Then the login process should be secure
    And user information should be protected