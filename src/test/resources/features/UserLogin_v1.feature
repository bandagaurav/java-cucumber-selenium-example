Feature: User Login

  Scenario Outline: User logs in with valid credentials
    Given the user is on the login page
    When the user enters the username "<username>" and password "<password>"
    And clicks the login button
    Then the user should be successfully logged in
    And the user should have access to the private area

    Examples:
      | username | password |
      | admin    | pw1234   |

  Scenario Outline: User logs in with invalid credentials
    Given the user is on the login page
    When the user enters the username "<username>" and password "<password>"
    And clicks the login button
    Then the user should not be logged in
    And the user should see an error message "Invalid username or password"

    Examples:
      | username | password |
      | admin    | wrongpw  |
      | wronguser| pw1234   |
      | wronguser| wrongpw  |

  Scenario: Login process security
    Given the user is on the login page
    When the user enters the username "admin" and password "pw1234"
    And clicks the login button
    Then the login process should be secure
    And user information should be protected