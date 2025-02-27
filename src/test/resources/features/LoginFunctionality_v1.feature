Feature: Login Functionality

  Scenario Outline: Successful login with correct credentials
    Given I navigate to login page
    When I submit username "<username>" and password "<password>"
    And I click login button
    Then I will be logged into the Admin Dashboard
    And I should be able to access the protected area

    Examples:
      | username | password |
      | admin    | pw1234   |

  Scenario Outline: Unsuccessful login with incorrect credentials
    Given I navigate to login page
    When I submit username "<username>" and password "<password>"
    And I click login button
    Then I should be able to access the protected area
    And I will see message "Thank you!"

    Examples:
      | username | password |
      | admin    | wrongpw  |
      | wronguser| pw1234   |
      | wronguser| wrongpw  |

  Scenario: Secure login process
    Given I navigate to login page
    When I submit username "admin" and password "pw1234"
    And I click login button
    Then the login process should be secure
    And the user information should be protected