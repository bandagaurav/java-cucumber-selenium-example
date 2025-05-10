Feature: Success Message
  As a user, I want to see a success message when my action is completed successfully.

  Scenario: User sees success message after action
    Given I have performed the necessary action
    When I complete the action
    Then I should see a success message confirming the completion