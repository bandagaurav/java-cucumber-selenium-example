Feature: Login and Conversion Feature

  Scenario: Successful Login and Conversion
    Given I navigate to the login page
    When I click the login button
    Then I should be able to access the private area
    When I click the convert button
    Then the total "June" sales amount is "32164"
    Then the page will respond with <response> and provide as reason <reason>