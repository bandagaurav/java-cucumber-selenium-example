Feature: User Login

  Scenario Outline: User logs in with valid credentials
    Given I navigate to login page
    When I submit username "<username>" and password "<password>"
    And I click login button
    Then I should be able to access the protected area
    And the user should have access to the private area

    Examples:
      | username | password |
      | admin    | pw1234   |

  Scenario Outline: User logs in with invalid credentials
    Given I navigate to login page
    When I submit username "<username>" and password "<password>"
    And I click login button
    Then the user should not be logged in
    And the user should see an error message "Invalid username or password"

    Examples:
      | username | password |
      | admin    | wrongpw  |
      | user     | pw1234   |
      | user     | wrongpw  |

  Scenario: Login process should be secure
    Given I navigate to login page
    When I submit username "admin" and password "pw1234"
    And I click login button
    Then the login process should follow best practices to protect user information