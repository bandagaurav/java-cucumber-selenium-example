Feature: New BDD Scenarios

  Scenario: Accessing private area
    Given I navigate to login page
    When I click login button
    Then I should be able to access the private area

  Scenario: Convert button functionality
    When I click the convert button
    Then the total "June" sales amount is "32164"

  Scenario: Handling responses
    Then the page will respond with <response> and provide as reason <reason>