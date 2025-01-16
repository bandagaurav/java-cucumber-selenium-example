Feature: New BDD Scenarios

  Scenario: Login and Navigate to Private Area
    Given I navigate to login page
    When I click login button
    Then I should be able to access the private area

  Scenario: Convert Button Functionality
    When I click the convert button
    Then the total "June" sales amount is "32164"

  Scenario: Page Response Handling
    Then the page will respond with <response> and provide as reason <reason>

  Scenario: Success Message Display
    Then the page will provide a success message