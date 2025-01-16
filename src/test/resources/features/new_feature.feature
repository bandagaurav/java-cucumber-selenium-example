Feature: Add success message
  Scenario: User sees success message after submission
    Given user is on the submission page
    When user submits the form
    Then a success message is displayed