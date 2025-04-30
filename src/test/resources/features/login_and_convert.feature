Feature: Login and Convert Sales

  Scenario: Successful Login and Sales Conversion
    Given I navigate to login page
    When I click login button
    Then I should be able to access the private area
    When I click the convert button
    Then the total "June" sales amount is "32164"
    Then the page will respond with <response> and provide as reason <reason>
    Then the page will provide a success message