Feature: Login Functionality

  Scenario: Successful login with correct credentials
    Given I navigate to login page
    When I enter the username 'admin' and password 'pw1234'
    And I click the login button
    Then I should be successfully logged in
    And I should have access to the private area

  Scenario: Support for horizontal data table for login
    Given I navigate to login page
    And I enter following for login
      | username | password |
      | admin    | pw1234   |
    When I click login button
    Then I should be able to access the protected area

  Scenario: Support for vertical data table for login
    Given I navigate to login page
    And I enter following values to login
      | username | admin  |
      | password | pw1234 |
    When I click login button
    Then I should be able to access the protected area

  Scenario: Unsuccessful login with incorrect credentials
    Given I navigate to login page
    When I enter the username 'admin' and password 'wrongpassword'
    And I click the login button
    Then I should not be logged in
    And I should see an error message 'Incorrect username or password'

  Scenario: Secure login process
    Given I navigate to login page
    When I enter the username 'admin' and password 'pw1234'
    And I click the login button
    Then the login process should follow best practices to protect user information
    And I should be successfully logged in
    And I should have access to the private area