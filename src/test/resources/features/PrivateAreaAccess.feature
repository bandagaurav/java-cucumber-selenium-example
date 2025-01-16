Feature: Private Area Access
  As a user, I want to access the private area of the website

  Scenario: Access Private Area
    Given I am logged in as a registered user
    When I navigate to the private area
    Then I should see the private area content