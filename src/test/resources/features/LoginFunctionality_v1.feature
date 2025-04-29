Feature: Login Functionality

  Scenario Outline: Successful login with correct credentials
    Given I navigate to login page
    When I enter following for login
      | username | password |
      | <username> | <password> |
    And I click login button
    Then I should be able to access the protected area

    Examples:
      | username | password |
      | admin    | pw1234   |

  Scenario Outline: Unsuccessful login with incorrect credentials
    Given I navigate to login page
    When I enter following for login
      | username | password |
      | <username> | <password> |
    And I click login button
    Then the user should not be able to access the private area
    And the user should be notified with an appropriate error message

    Examples:
      | username | password |
      | admin    | wrongpw  |
      | wronguser| pw1234   |
      | wronguser| wrongpw  |

  Scenario: Secure login process
    Given I navigate to login page
    When I enter following for login
      | username | password |
      | admin    | pw1234   |
    And I click login button
    Then the login process should be secure
    And user information should be protected following best practices