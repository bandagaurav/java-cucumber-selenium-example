Feature: Login Functionality

  Scenario Outline: Successful login with correct credentials
    Given I navigate to login page
    When I enter following for login | username | password |
    When I click login button
    Then I should be able to access the protected area
    And the user should have access to the private area

    Examples:
      | username | password |
      | admin    | pw1234   |

  Scenario Outline: Unsuccessful login with incorrect credentials
    Given I navigate to login page
    When I enter following for login | username | password |
    When I click login button
    Then I should not be able to access the protected area
    And the user should be notified with an appropriate error message

    Examples:
      | username | password |
      | admin    | wrongpw  |
      | user     | pw1234   |
      | user     | wrongpw  |

  Scenario: Secure login process
    Given I navigate to login page
    When I enter following for login | username | password |
    When I click login button
    Then the login process should be secure
    And user information should be protected following best practices