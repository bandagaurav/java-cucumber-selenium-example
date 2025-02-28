Feature: User Login

  Scenario Outline: Successful login with valid credentials
    Given I navigate to login page
    And I enter following for login
    When I click login button
    Then I should be able to access the protected area

    Examples:
      | username | password |
      | admin    | pw1234   |

  Scenario Outline: Unsuccessful login with invalid credentials
    Given I navigate to login page
    And I enter following for login
    When I click login button
    Then I should be able to access the protected area
    And the user should see an error message "Invalid username or password"

    Examples:
      | username | password |
      | admin    | wrongpw  |
      | wronguser| pw1234   |
      | wronguser| wrongpw  |

  Scenario: Secure login process
    Given I navigate to login page
    And I enter following for login
    When I click login button
    Then the login process should be secure
    And user information should be protected