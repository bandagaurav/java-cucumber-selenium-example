Feature: Access Private Area
  Scenario: Successful login and access to private area
    Given I navigate to login page
    When I click login button
    Then I should be able to access the private area

Feature: Convert Button Functionality
  Scenario: Convert button triggers correct response
    When I click the convert button
    Then the page will respond with <response> and provide as reason <reason>