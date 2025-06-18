Feature: Validate Deposit Currency

  Scenario: Successfully validate deposit currency
    Given a bill payment deposit is received with a specified currency
    When the system validates the deposit currency
    Then the currency is checked against the client account's allowed currencies
    And the deposit is processed if the currency is valid

  Scenario: Handle invalid deposit currency
    Given a bill payment deposit is received with an unsupported currency
    When the system validates the deposit currency
    Then the deposit is flagged as invalid
    And a notification is sent to the operations team for manual review