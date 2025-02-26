Feature: User Login

Scenario Outline: Successful login with valid credentials
  Given I navigate to login page
  When I enter following for login
    | username | password |
    | <username> | <password> |
  And I click login button
  Then I should be able to access the protected area
  And the user should have access to the private area

  Examples:
    | username | password |
    | admin    | pw1234   |

Scenario Outline: Unsuccessful login with invalid credentials
  Given I navigate to login page
  When I enter following for login
    | username | password |
    | <username> | <password> |
  And I click login button
  Then the user should not be logged in
  And the user should see an error message "Invalid username or password"

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
  And user information should be protected