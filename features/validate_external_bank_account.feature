Feature: Validate External Bank Account

  Scenario: Successfully validate external bank account details
    Given a new external bank account is added for a deposit
    When the system performs electronic validation
    Then the external bank account details are validated successfully
    And the deposit process continues