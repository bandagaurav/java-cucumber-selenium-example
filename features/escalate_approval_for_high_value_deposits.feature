Feature: Escalate Approval for High-Value Deposits

  Scenario: Flag deposit for approval due to high value
    Given a deposit request exceeds the predefined threshold
    When the system processes the deposit
    Then the deposit is flagged for approval
    And the approval task is assigned to the appropriate role