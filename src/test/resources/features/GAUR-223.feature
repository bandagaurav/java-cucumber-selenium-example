Feature: User Login
  As a user, I want to log in using my credentials so that I can access private areas of the application.

  Scenario: Successful Login
    Given I navigate to login page
    When I enter the correct username "admin" and password "pw1234"
    And I click login button
    Then I should be successfully logged in
    And I should have access to the private area

  Scenario: Support for Horizontal and Vertical Data Tables
    Given I navigate to login page
    When I enter the username and password using horizontal data tables
    And I click login button
    Then I should be successfully logged in
    And I should have access to the private area

    Given I navigate to login page
    When I enter the username and password using vertical data tables
    And I click login button
    Then I should be successfully logged in
    And I should have access to the private area

  Scenario: Incorrect Credentials
    Given I navigate to login page
    When I enter an incorrect username or password
    And I click login button
    Then I should not be able to access the private area
    And I should be notified with an appropriate error message

  Scenario: Secure Login Process
    Given I navigate to login page
    When I enter my username and password
    And I click login button
    Then the login process should be secure
    And it should follow best practices to protect user information