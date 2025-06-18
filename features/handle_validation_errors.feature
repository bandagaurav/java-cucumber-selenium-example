Feature: Handle Validation Errors

  Scenario: Display error for invalid deposit details
    Given a deposit request is submitted with invalid details (e.g., missing mandatory fields)
    When the system validates the deposit details
    Then an error message is displayed to the user
    And the user is prompted to correct the invalid details