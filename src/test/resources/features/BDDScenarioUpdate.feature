Feature: BDD Scenario Update
  As a user, I want to update BDD scenarios to ensure they align with current application behavior.

  Scenario: Update existing BDD scenario
    Given I have an existing BDD scenario
    When I update the scenario with new requirements
    Then the scenario should reflect the updated requirements